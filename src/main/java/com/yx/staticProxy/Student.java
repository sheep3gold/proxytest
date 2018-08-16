package com.yx.staticProxy;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 17:24 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}

