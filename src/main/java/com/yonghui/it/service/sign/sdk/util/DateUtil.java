package com.yonghui.it.service.sign.sdk.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static long getUnixTime(Date date){
        return date.getTime()/1000;
    }
    public static Date addMinutes(final Date date, final int amount) {
        return add(date, Calendar.MINUTE, amount);
    }

    private static Date add(final Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        final Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }
}
