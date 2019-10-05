package com.xyw.designPattern.factory.factoyMethod;

import com.xyw.common.CommonConstant;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/1
 * Time:09:50
 * 工厂方法模式
 */


public class FactoryMethod {
    public static void main(String[] args) throws Exception {
        IFactory iFactory;

        iFactory = new SmallFactory();
        iFactory.produce().run();

        iFactory = new BigFactory();
        iFactory.produce().run();
    }
}

//抽象产品
interface MeizuPhone{
    void run();
}

//具体产品
class PRO5 implements MeizuPhone {

    @Override
    public void run() {
        System.out.println("This is pro5");
    }
}

class PRO6 implements MeizuPhone {

    @Override
    public void run() {
        System.out.println("This is PRO6");
    }
}

//抽象工厂
interface IFactory{
    MeizuPhone produce();
}

class BigFactory implements IFactory{

    @Override
    public MeizuPhone produce() {
        return new PRO5();
    }
}

class SmallFactory implements IFactory{

    @Override
    public MeizuPhone produce() {
        return new PRO6();
    }
}


