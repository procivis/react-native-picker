package com.henninghall.date_picker.wheels;

import android.graphics.Paint;

import com.henninghall.date_picker.LocaleUtils;
import com.henninghall.date_picker.pickers.Picker;
import com.henninghall.date_picker.State;
import com.henninghall.date_picker.models.Mode;

import java.util.ArrayList;
import java.util.Calendar;

public class StringWheel extends Wheel
{
    public StringWheel(final Picker picker, final State id) {
        super(picker, id);
    }

    @Override
    public ArrayList<String> getValues() {
        return state.getItems();
    }

    @Override
    public boolean visible() {
        return state.getMode() == Mode.list;
    }

    @Override
    public boolean wrapSelectorWheel() {
        return false;
    }

    @Override
    public Paint.Align getTextAlign() {
        return Paint.Align.CENTER;
    }

    @Override
    public String getFormatPattern() {
        return LocaleUtils.getYear(state.getLocaleLanguageTag());
    }

    @Override
    public String getValue() {
        return getValueAtIndex(getIndex());
    }

    public void setStringValue(String value) {
        int index = getValues().indexOf(value);
        if (index == -1) {
            return;
        }
        picker.setValue(index);
    }

}

