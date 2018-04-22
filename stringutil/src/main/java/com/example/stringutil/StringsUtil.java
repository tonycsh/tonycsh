package com.example.stringutil;

import java.math.BigDecimal;

/**
 * Created by 陈少华 on 4/22/18.
 */

public class StringsUtil {

    /**
     * 纯数字类型的字符串 末尾的 多余的零清除
     * @param number
     * @return
     */
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
