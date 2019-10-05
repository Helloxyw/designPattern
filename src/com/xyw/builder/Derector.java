package com.xyw.builder;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/2
 * Time:09:53
 * 指挥官 向用户提供具体的生成器
 */
public class Derector {

    private IDateBuilder builder;

    public Derector(IDateBuilder builder){
        this.builder = builder;
    }

    public String getDate(int y,int m, int d){
        builder.buildDate(y, m, d);
        return builder.date();
    }
}
