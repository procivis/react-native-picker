package com.henninghall.date_picker.props;

import com.facebook.react.bridge.Dynamic;

import java.util.ArrayList;
import java.util.Objects;

public class ItemsProp extends Prop<ArrayList<String>> {
    public static final String name = "items";

    @Override
    public ArrayList<String> toValue(Dynamic value) {
        ArrayList arrayList = value.asArray().toArrayList();
        ArrayList<String> strings = new ArrayList<String>(arrayList.size());
        for (Object object : arrayList) {
            strings.add(Objects.toString(object, null));
        }
        return strings;
    }
}
