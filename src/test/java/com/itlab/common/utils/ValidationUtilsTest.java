package com.itlab.common.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ValidationUtilsTest {

    @Test
    void 휴대폰번호_유효성체크() {
        // given
        String phoneNumber = "010-0000-0000";

        // when
        boolean result = ValidationUtils.checkPhoneNumber(phoneNumber);

        // then
        assertThat(result).isEqualTo(true);
    }
    @Test
    void 휴대폰번호_유효성체크_실패() {
        // given
        String phoneNumber = "012-0000-0000";

        // when
        // then
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> ValidationUtils.checkPhoneNumber(phoneNumber));
        assertThat(illegalArgumentException.getMessage()).isEqualTo(String.format("%s is not phoneNumber!", phoneNumber));
    }
}