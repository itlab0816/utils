package com.itlab.common.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsTest {

    @Test
    void checkPhoneNumber() {
        ValidationUtils.checkPhoneNumber("010-4652-7403");
        ValidationUtils.checkPhoneNumber("011-4652-7403");
        ValidationUtils.checkPhoneNumber("012-4652-7403");
        ValidationUtils.checkPhoneNumber("013-4652-7403");
        ValidationUtils.checkPhoneNumber("014-4652-7403");
    }
}