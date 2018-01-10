package com.deckerchan.puji.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTimeUtils {
    public static DateFormat defaultDateFormat() {
        return new SimpleDateFormat("dd/mm/yyyy");
    }

    public static DateFormat defaultDateTimeFormat() {
        return new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    }


}
