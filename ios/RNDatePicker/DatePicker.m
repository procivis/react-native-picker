/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
#import "RCTComponent.h"
#import "DatePicker.h"

#import <React/RCTUtils.h>
#import <React/UIView+React.h>

#define UIColorFromRGB(rgbHex) [UIColor colorWithRed:((float)((rgbHex & 0xFF0000) >> 16))/255.0 green:((float)((rgbHex & 0xFF00) >> 8))/255.0 blue:((float)(rgbHex & 0xFF))/255.0 alpha:1.0]

@interface DatePicker ()

@property (nonatomic, copy) RCTBubblingEventBlock onChange;
@property (nonatomic, assign) NSInteger reactMinuteInterval;

@end

@implementation DatePicker

- (UIColor *)colorFromHexCode:(NSString *)hexString {
    NSString *cleanString = [hexString stringByReplacingOccurrencesOfString:@"#" withString:@""];
    if([cleanString length] == 3) {
        cleanString = [NSString stringWithFormat:@"%@%@%@%@%@%@",
                       [cleanString substringWithRange:NSMakeRange(0, 1)],[cleanString substringWithRange:NSMakeRange(0, 1)],
                       [cleanString substringWithRange:NSMakeRange(1, 1)],[cleanString substringWithRange:NSMakeRange(1, 1)],
                       [cleanString substringWithRange:NSMakeRange(2, 1)],[cleanString substringWithRange:NSMakeRange(2, 1)]];
    }
    if([cleanString length] == 6) {
        cleanString = [cleanString stringByAppendingString:@"ff"];
    }
    
    unsigned int baseValue;
    [[NSScanner scannerWithString:cleanString] scanHexInt:&baseValue];
    
    float red = ((baseValue >> 24) & 0xFF)/255.0f;
    float green = ((baseValue >> 16) & 0xFF)/255.0f;
    float blue = ((baseValue >> 8) & 0xFF)/255.0f;
    float alpha = ((baseValue >> 0) & 0xFF)/255.0f;
    
    return [UIColor colorWithRed:red green:green blue:blue alpha:alpha];
}

- (instancetype)initWithFrame:(CGRect)frame
{
    if ((self = [super initWithFrame:frame])) {
        [self addTarget:self action:@selector(didChange)
       forControlEvents:UIControlEventValueChanged];
        if(@available(iOS 13, *)) {
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
        }
        if(@available(iOS 14, *)) {
            self.preferredDatePickerStyle = UIDatePickerStyleWheels;
        }
         _reactMinuteInterval = 1;
         
        // only allow gregorian calendar
        self.calendar = [NSCalendar calendarWithIdentifier:NSCalendarIdentifierGregorian];
    }
    return self;
}

- (void)setColor:(NSString *)hexColor {
    // Hex to int color
    unsigned intColor = 0;
    NSScanner *scanner = [NSScanner scannerWithString:hexColor];
    [scanner setScanLocation:1]; // bypass '#' character
    [scanner scanHexInt:&intColor];

    // Setting picker text color
    [self setValue:UIColorFromRGB(intColor) forKeyPath:@"textColor"];
}

- (void)removeTodayString {
    #pragma clang diagnostic push
    #pragma clang diagnostic ignored "-Wundeclared-selector"
    [self performSelector:@selector(setHighlightsToday:) withObject:[NSNumber numberWithBool:NO]];
    #pragma clang diagnostic pop
}


- (void)setTextColorProp:(NSString *)hexColor
{
    
    if(@available(iOS 13, *)) {

        // black text -> set light mode
        if([hexColor isEqualToString:@"#000000"]){
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
        }

        // white text -> set dark mode
        else if([hexColor isEqualToString:@"#FFFFFF"] || [hexColor isEqualToString:@"#ffffff"]){
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleDark;
        }
        // other colors -> remove "Today" string since it cannot be colored from iOS 13.
        else {
            [self removeTodayString];
            [self setColor:hexColor];
        }
    }

    // if ios 12 and earlier -> no need to remove today string since it can be colored.
    else {
        [self setColor:hexColor];
    }
}

RCT_NOT_IMPLEMENTED(- (instancetype)initWithCoder:(NSCoder *)aDecoder)

- (void)didChange
{
    if (_onChange) {
        _onChange(@{ @"timestamp": @(self.date.timeIntervalSince1970 * 1000.0) });
    }
}

- (void)setDatePickerMode:(UIDatePickerMode)datePickerMode
{
  [super setDatePickerMode:datePickerMode];
  // We need to set minuteInterval after setting datePickerMode, otherwise minuteInterval is invalid in time mode.
  self.minuteInterval = _reactMinuteInterval;
}

- (void)setMinuteInterval:(NSInteger)minuteInterval
{
  [super setMinuteInterval:minuteInterval];
  _reactMinuteInterval = minuteInterval;
}

@end

@interface Picker () <UIPickerViewDataSource, UIPickerViewDelegate>

@property (nonatomic, copy) RCTBubblingEventBlock onChange;
@property (nonatomic, assign) NSInteger reactMinuteInterval;

@end

@implementation Picker

@synthesize selectedValue = _selectedValue, items = _items;

- (instancetype)initWithFrame:(CGRect)frame
{
    if ((self = [super initWithFrame:frame])) {
        if (@available(iOS 13, *)) {
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
        }
         
        self.dataSource = self;
        self.delegate = self;
    }
    return self;
}

- (NSString *)selectedValue {
    NSUInteger row = [self selectedRowInComponent:0];
    if (row != NSNotFound && row < self.items.count) {
        return self.items[row];
    }
    return nil;
}

- (void)setSelectedValue:(NSString *)selectedValue {
    _selectedValue = selectedValue;
    NSUInteger row = [self.items indexOfObject:selectedValue];
    if (row != NSNotFound) {
        [self selectRow:row inComponent:0 animated:NO];
    }
}

- (void)setItems:(NSArray<NSString *> *)items {
    _items = items;
    [self reloadComponent:0];
    if (_selectedValue) {
        self.selectedValue = _selectedValue;
    }
}

- (void)setColor:(NSString *)hexColor {
    // Hex to int color
    unsigned intColor = 0;
    NSScanner *scanner = [NSScanner scannerWithString:hexColor];
    [scanner setScanLocation:1]; // bypass '#' character
    [scanner scanHexInt:&intColor];

    // Setting picker text color
    [self setValue:UIColorFromRGB(intColor) forKeyPath:@"textColor"];
}

- (void)setTextColorProp:(NSString *)hexColor
{
    [self setColor:hexColor];
    if(@available(iOS 13, *)) {

        // black text -> set light mode
        if([hexColor isEqualToString:@"#000000"]){
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
        }

        // white text -> set dark mode
        else if([hexColor isEqualToString:@"#FFFFFF"] || [hexColor isEqualToString:@"#ffffff"]){
            self.overrideUserInterfaceStyle = UIUserInterfaceStyleDark;
        }
    }
}

RCT_NOT_IMPLEMENTED(- (instancetype)initWithCoder:(NSCoder *)aDecoder)

- (NSInteger)numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger)pickerView:(UIPickerView *)pickerView numberOfRowsInComponent:(NSInteger)component {
    return self.items.count;
}

- (NSString *)pickerView:(UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component {
    return self.items[row];
}

- (void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    if (_onChange) {
        _onChange(@{ @"value": self.items[row] });
    }
}

@end

