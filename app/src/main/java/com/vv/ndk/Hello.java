package com.vv.ndk;

/**
 * Created by ShenZhenWei on 18/2/8.
 */

public class Hello {
    static {
        System.loadLibrary("hello");
    }
    public static native String sayHello();
}
