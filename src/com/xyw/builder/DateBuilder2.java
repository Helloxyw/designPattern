package com.xyw.builder;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/2
 * Time:10:06
 */
public class DateBuilder2 implements IDateBuilder {
    private MyDate myDate;

    public DateBuilder2(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public IDateBuilder buildDate(int y, int m, int d) {
        myDate.date = y + " " + m + " " + d;
        return this;
    }

    @Override
    public String date() {
        return myDate.date;
    }
}
