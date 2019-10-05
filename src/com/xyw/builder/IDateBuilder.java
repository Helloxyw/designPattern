package com.xyw.builder;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/2
 * Time:09:51
 * 抽象生成器
 */
public interface IDateBuilder {

    IDateBuilder buildDate(int y, int m, int d);

    String date();
}
