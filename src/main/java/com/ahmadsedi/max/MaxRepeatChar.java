package com.ahmadsedi.max;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 28/12/2024
 * Time: 21:18
 */

public class MaxRepeatChar {

    public static Optional<Character> findMaximumRepeatCharacter(Character[] input){
       return Arrays.stream(input).map(CharNumber::new).reduce(CharNumber::add).map(e->e.findMax().getCh());
    }

    static class CharNumber {
        Character ch;
        int number;

        CharNumber nextElement;

        public CharNumber(Character ch) {
            this.ch = ch;
            this.number = 1;
        }

        public CharNumber add(CharNumber charNumber){
            if(ch == charNumber.ch){
                number++;
            }else if(nextElement==null){
                nextElement = charNumber;
            }else{
                nextElement.add(charNumber);
            }
            return this;
        }

        public CharNumber findMax(){
            CharNumber charNumber = this;
            if(nextElement!=null){
                CharNumber nextMax = nextElement.findMax();
                if(charNumber.number<nextMax.number){
                    charNumber = nextMax;
                }
            }
            return charNumber;
        }

        public char getCh() {
            return ch;
        }

        public int getNumber() {
            return number;
        }
    }
}
