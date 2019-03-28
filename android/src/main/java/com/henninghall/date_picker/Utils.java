package com.henninghall.date_picker;


import android.text.format.DateUtils;
import android.util.TypedValue;
import android.view.View;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Utils {

    public static boolean usesAmPm(Locale locale) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL, locale);
        return df instanceof SimpleDateFormat && ((SimpleDateFormat) df).toPattern().contains("a");
    }

    public static String printToday(Locale locale) {
        return UnitPatterns.of(locale).getTodayWord();
    }

    public static Calendar isoToCalendar(String dateString, TimeZone timeZone)  {
        if(dateString == null) return null;
        try {
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(getIsoUTCFormat().parse(dateString));
            return calendar;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String dateToIso(Calendar date) {
        return getIsoUTCFormat().format(date.getTime());
    }

    public static int getWheelHeight(View pickerView) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 160, pickerView.getResources().getDisplayMetrics());
    }

    public static String localeToYmdPattern(Locale locale) {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        String pattern = ((SimpleDateFormat)formatter).toLocalizedPattern();
        pattern = pattern.replaceAll("\\[", "");
        pattern = pattern.replaceAll("]", "");
        pattern = pattern.replaceAll(" ", "");
        pattern = pattern.replaceAll("[.]", "/");
        pattern = pattern.replaceAll("-", "/");
        return pattern;
    }

    public static boolean isToday(Calendar cal){
        return DateUtils.isToday(cal.getTimeInMillis());
    }

    public static Calendar getTruncatedCalendarOrNull(Calendar cal) {
        try {
            return org.apache.commons.lang3.time.DateUtils.truncate(cal, Calendar.MINUTE);
        } catch (Exception e){
            return null;
        }
    }

    private static SimpleDateFormat getIsoUTCFormat(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        format.setTimeZone(TimeZone.getTimeZone("UTC"));

        return format;
    }

}
