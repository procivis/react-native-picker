package com.henninghall.date_picker.props;

import com.facebook.react.bridge.Dynamic;

public class SelectedValueProp extends Prop<String> {
    public static final String name = "selectedValue";

    @Override
    public String toValue(Dynamic value){
        return value.asString();
    }
}
