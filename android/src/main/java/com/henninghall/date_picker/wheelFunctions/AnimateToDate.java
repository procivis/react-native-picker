package com.henninghall.date_picker.wheelFunctions;

import com.henninghall.date_picker.wheels.Wheel;

import java.util.Date;

public class AnimateToDate implements WheelFunction {

    private Date date;

    public AnimateToDate(Date date) {
        this.date = date;
    }

    @Override
    public void apply(Wheel wheel) {
        wheel.animateToDate(date);
    }
}


