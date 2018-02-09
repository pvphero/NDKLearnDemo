package com.vv.ndk;

/**
 * Created by ShenZhenWei on 18/2/9.
 */

public class Hi {
    static {
        System.loadLibrary("hello");
    }
    public static native String sayHi();
}
