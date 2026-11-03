package com.taxurfriends.util;

import java.util.UUID;

public class IdGen {
    public static String genId() {
        return UUID.randomUUID().toString();
    }
}
