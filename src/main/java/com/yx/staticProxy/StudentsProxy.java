package com.yx.staticProxy;

/**
 * @ Author     ：yx
 * @ Date       ：Created in 17:27 2018/8/16
 * @ Description：${description}
 * @ Modified By：
 */
public class StudentsProxy implements Person{
    Student stu;
    public StudentsProxy(Person stu){
        if(stu.getClass()==Student.class){
            this.stu= (Student) stu;
        }
    }
    @Override
    public void giveMoney() {
        stu.giveMoney();
    }
}
