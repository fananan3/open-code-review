package com.yh.middleware.sdk.types.util;

import java.util.Random;

/**
 * @Description
 * @Author fanyiheng
 * @Date 2026/10/11 15:51
 */
public class RandomStringUtils {
    public static String randomNumeric(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
