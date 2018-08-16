package com.yx.staticProxy;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 17:31 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Person zhangsan=new Student("zhangsan");
        Person monitor=new StudentsProxy(zhangsan);
        monitor.giveMoney();
    }
}
