package com.example.chenshaohua.stringsutil;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
        System.out.print(NumberNoZero("123.01000000000"));
    }

    public static String NumberNoZero(Object number){
        try {
            return BigDecimal.valueOf(Double.parseDouble(number.toString()))+"";
        } catch (NumberFormatException e) {
            try {
                return number.toString();
            } catch (Exception e1) {
                return "";
            }
        }
    }
}