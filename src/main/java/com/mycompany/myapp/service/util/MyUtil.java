package com.mycompany.myapp.service.util;

import java.time.Instant;

import com.mycompany.myapp.config.Constants;

import org.apache.commons.lang3.StringUtils;

public class MyUtil {

    public static Instant getInstantFromStringDate(String date) {
        if(!StringUtils.isEmpty(date) && date.matches(Constants.DATE_REGEX)) {
            return Instant.parse(date + "T00:00:00.00Z");
        } else {
            return null;
        }
    }
}
