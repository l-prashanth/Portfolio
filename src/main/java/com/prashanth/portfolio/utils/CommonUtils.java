package com.prashanth.portfolio.utils;

import java.util.UUID;

public class CommonUtils {
    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
