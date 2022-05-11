package com.itlab.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Pattern;

/**
 * Date Type
 * Code
 * Range
 * Format
 */
public class ValidationUtils {

    private static final Logger logger = LoggerFactory.getLogger(ValidationUtils.class);

    public static boolean checkPhoneNumber(String phoneNumber) {
        // 010, 011, 016, 017, 018, 019-0000-0000
        String phoneNumberReg = "(01[016789])-(\\d{3,4})-(\\d{4})";

//        Pattern pattern = Pattern.compile(phoneNumberReg);
//        boolean isMatch = pattern.matcher(phoneNumber).matches();

        boolean isMatch = Pattern.matches(phoneNumberReg, phoneNumber);

        if (!isMatch) {
            logger.debug("{} is not phoneNumber!", phoneNumber);
            throw new IllegalArgumentException(String.format("%s is not phoneNumber!", phoneNumber));
        }

        return isMatch;
    }

}
