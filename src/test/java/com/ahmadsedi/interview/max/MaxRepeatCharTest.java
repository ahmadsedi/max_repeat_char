package com.ahmadsedi.interview.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 28/12/2024
 * Time: 22:49
 */

public class MaxRepeatCharTest {

    @Test
    void findMaximumRepeatCharacter_givenEmptyArray_emptyOptionalExpected(){
        Character[] input = {};
        Optional<Character> maxRepeatChar = MaxRepeatChar.findMaximumRepeatCharacter(input);
        Assertions.assertTrue(maxRepeatChar.isEmpty());
    }

    @Test
    void findMaximumRepeatCharacter(){
        Character[] input = {'C', 'B', 'A', 'D', 'B'};
        Optional<Character> maxRepeatChar = MaxRepeatChar.findMaximumRepeatCharacter(input);
        Assertions.assertEquals('B', maxRepeatChar.get());
    }
}
