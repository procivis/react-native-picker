/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#import "RNDatePickerManager.h"
#import <React/RCTLog.h>

#import <React/RCTConvert.h>

#import "DatePicker.h"

@implementation RCTConvert(UIDatePicker)

RCT_ENUM_CONVERTER(UIDatePickerMode, (@{
  @"time": @(UIDatePickerModeTime),
  @"date": @(UIDatePickerModeDate),
  @"datetime": @(UIDatePickerModeDateAndTime),
  @"countdown": @(UIDatePickerModeCountDownTimer), // not supported yet
}), UIDatePickerModeTime, integerValue)

@end

@implementation RNDatePickerManager

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(addListener : (NSString *)eventName) {
  // Keep: Required for RN built in Event Emitter Calls.
}

RCT_EXPORT_METHOD(removeListeners : (NSInteger)count) {
  // Keep: Required for RN built in Event Emitter Calls.
}

- (UIView *)view
{
  return [DatePicker new];
}

RCT_EXPORT_VIEW_PROPERTY(date, NSDate)
RCT_EXPORT_VIEW_PROPERTY(locale, NSLocale)
RCT_EXPORT_VIEW_PROPERTY(minimumDate, NSDate)
RCT_EXPORT_VIEW_PROPERTY(maximumDate, NSDate)
RCT_EXPORT_VIEW_PROPERTY(minuteInterval, NSInteger)
RCT_EXPORT_VIEW_PROPERTY(onChange, RCTBubblingEventBlock)
RCT_REMAP_VIEW_PROPERTY(mode, datePickerMode, UIDatePickerMode)
RCT_REMAP_VIEW_PROPERTY(timeZoneOffsetInMinutes, timeZone, NSTimeZone)


RCT_CUSTOM_VIEW_PROPERTY(textColor, NSString, DatePicker)
{
    [view setTextColorProp:[RCTConvert NSString:json]];
}

RCT_EXPORT_METHOD(openPicker:(NSDictionary *) props
                  onConfirm:(RCTResponseSenderBlock) onConfirm
                  onCancel:(RCTResponseSenderBlock) onCancel)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        
        bool iPad = UI_USER_INTERFACE_IDIOM() == UIUserInterfaceIdiomPad;
        UIViewController *rootViewController = [UIApplication sharedApplication].delegate.window.rootViewController;
        CGRect rootBounds = rootViewController.view.bounds;
        NSString * title = [RCTConvert NSString:[props objectForKey:@"title"]];
        title = [title isEqualToString:@""] ? nil : title;
        NSString * confirmText = [RCTConvert NSString:[props objectForKey:@"confirmText"]];
        NSString * cancelText = [RCTConvert NSString:[props objectForKey:@"cancelText"]];
        UIControl* picker;
        UIAlertController *alertController = [UIAlertController alertControllerWithTitle:title message:nil preferredStyle:UIAlertControllerStyleActionSheet];
        UIView * alertView = alertController.view;

        NSString *mode = [RCTConvert NSString:[props objectForKey:@"mode"]];

        UIAlertAction *confirmAction;

        if ([mode isEqualToString:@"list"]) {
            Picker * listPicker = [[Picker alloc] init];
        
            NSDate * selectedValue = [RCTConvert NSString:[props objectForKey:@"selectedValue"]];
            [listPicker setSelectedValue:selectedValue];
            
            NSArray<NSString *> * items = [RCTConvert NSArray:[props objectForKey:@"items"]];
            [listPicker setItems:items];
     
            NSString * textColor = [RCTConvert NSString:[props objectForKey:@"textColor"]];
            if(textColor) [listPicker setTextColorProp:textColor];
        
            confirmAction = [UIAlertAction actionWithTitle:confirmText style:UIAlertActionStyleDefault handler:^(UIAlertAction *action) {
                onConfirm(@[@{ @"value": listPicker.selectedValue }]);
            }];
   
            picker = listPicker;
        } else {
            DatePicker *datePicker = [[DatePicker alloc] init];

            NSDate * _Nonnull date = [RCTConvert NSDate:[props objectForKey:@"date"]];
            [datePicker setDate:date];

            NSDate * minimumDate = [RCTConvert NSDate:[props objectForKey:@"minimumDate"]];
            if(minimumDate) [datePicker setMinimumDate:minimumDate];
            
            NSDate * maximumDate = [RCTConvert NSDate:[props objectForKey:@"maximumDate"]];
            if(maximumDate) [datePicker setMaximumDate:maximumDate];
            
            NSString * textColor = [RCTConvert NSString:[props objectForKey:@"textColor"]];
            if(textColor) [datePicker setTextColorProp:textColor];
            
            UIDatePickerMode mode = [RCTConvert UIDatePickerMode:[props objectForKey:@"mode"]];
            [datePicker setDatePickerMode:mode];
            
            NSLocale * locale = [RCTConvert NSLocale:[props objectForKey:@"locale"]];
            if(locale) [datePicker setLocale:locale];

            int minuteInterval = [RCTConvert int:[props objectForKey:@"minuteInterval"]];
            [datePicker setMinuteInterval:minuteInterval];

            NSString * timeZoneProp = [props valueForKey:@"timeZoneOffsetInMinutes"];
            if(timeZoneProp){
                [datePicker setTimeZone:[RCTConvert NSTimeZone:timeZoneProp]];
            }

            confirmAction = [UIAlertAction actionWithTitle:confirmText style:UIAlertActionStyleDefault handler:^(UIAlertAction *action) {
                onConfirm(@[@{ @"timestamp": @(datePicker.date.timeIntervalSince1970 * 1000.0) }]);
            }];

            picker = datePicker;
        }

        CGRect pickerBounds = picker.bounds;

        // height
        double pickerHeight = [self getPickerHeight:alertView];
        int alertHeightPx = iPad ? (title ? 300 : 260) : (title ? 370 : 340);
        NSLayoutConstraint *height = [NSLayoutConstraint constraintWithItem:alertView attribute:NSLayoutAttributeHeight relatedBy:NSLayoutRelationEqual toItem:nil attribute:NSLayoutAttributeNotAnAttribute multiplier:1 constant:alertHeightPx];
        [alertView addConstraint:height];
        pickerBounds.size.height = pickerHeight;
        
        // width
        double pickerWidth = [self getPickerWidth:alertView];
        int alertWidthPx = pickerWidth;
        NSLayoutConstraint *width = [NSLayoutConstraint constraintWithItem:alertView attribute:NSLayoutAttributeWidth relatedBy:NSLayoutRelationEqual toItem:nil attribute:NSLayoutAttributeNotAnAttribute multiplier:1 constant:alertWidthPx];
        [alertView addConstraint:width];
        pickerBounds.size.width = pickerWidth;

        // top padding
        pickerBounds.origin.y += iPad ? (title ? 20: 5) : (title ? 30 : 10);
        
        [picker setFrame: pickerBounds];

        if(@available(iOS 13, *)) {
            NSString * _Nonnull theme = [RCTConvert NSString:[props objectForKey:@"theme"]];
            if ([theme isEqualToString:@"light"]) {
                alertController.overrideUserInterfaceStyle = UIUserInterfaceStyleLight;
            } else if ([theme isEqualToString:@"dark"]) {
                alertController.overrideUserInterfaceStyle = UIUserInterfaceStyleDark;
            } else {
                alertController.overrideUserInterfaceStyle = UIUserInterfaceStyleUnspecified;
            }
        }
        
        [alertView addSubview:picker];
        
        
        UIAlertAction *cancelAction = [UIAlertAction actionWithTitle:cancelText style:UIAlertActionStyleCancel handler:^(UIAlertAction *action) {
            onCancel(@[]);
        }];
            
        [alertController addAction:cancelAction];
        [alertController addAction:confirmAction];

        if (@available(iOS 9.0, *)) {
            alertController.preferredAction = confirmAction;
        }

        // ipad needs to display the picker in a popover
        if (iPad) {
            UIPopoverPresentationController *popPresenter = [alertController popoverPresentationController];
            popPresenter.sourceRect = CGRectMake(CGRectGetMidX(rootBounds), CGRectGetMidY(rootBounds),0,0);
            popPresenter.sourceView = rootViewController.view;
            popPresenter.presentingViewController.preferredContentSize = CGSizeMake(pickerWidth, alertHeightPx);
            [popPresenter setPermittedArrowDirections: (UIPopoverArrowDirection) 0];
        }
        
        // Finding the top view controller which is neccessary to be able to show the picker from within modal
        UIViewController *topViewController = rootViewController;
        while (topViewController.presentedViewController){
            topViewController = topViewController.presentedViewController;
        }
        
        [topViewController presentViewController:alertController animated:YES completion:nil];
    });

}

- (double) getPickerWidth :(UIView *) alertView
{
    bool iPad = UI_USER_INTERFACE_IDIOM() == UIUserInterfaceIdiomPad;
    bool isLandscape = UIDeviceOrientationIsLandscape([UIDevice currentDevice].orientation);
    if(iPad) return 320;
    if (isLandscape) return 320;
    return alertView.bounds.size.width - 15;
}

- (double) getPickerHeight :(UIView *) alertView
{
    return 216;
}

@end
