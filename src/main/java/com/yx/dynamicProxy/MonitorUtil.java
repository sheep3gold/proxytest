package com.yx.dynamicProxy;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 18:32 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}
