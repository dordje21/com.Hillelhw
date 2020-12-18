package com.hillel.homeworks.hw17;

import org.junit.jupiter.api.Test;

class ValidatorTest {

    @Test
    void validateBracesTestYes(){
        Validator validator = new Validator();
        validator.validateBraces("[{{}{}{{}}[{}][]{}}]");
    }

    @Test
    void validateBracesTestNo(){
        Validator validator = new Validator();
        validator.validateBraces("[{{}{{]}]");
    }

}