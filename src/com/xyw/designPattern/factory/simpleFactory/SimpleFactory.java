package com.xyw.designPattern.factory.simpleFactory;

import com.xyw.common.CommonConstant;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/1
 * Time:09:50
 * 简单工厂
 */


public class SimpleFactory {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        factory.produce(CommonConstant.PRO5).run();
        factory.produce(CommonConstant.PRO6).run();
    }
}

//抽象产品
interface MeizuPhone{
    void run();
}

//具体产品
class PRO5 implements MeizuPhone{

    @Override
    public void run() {
        System.out.println("This is pro5");
    }
}
class PRO6 implements MeizuPhone{

    @Override
    public void run() {
        System.out.println("This is PRO6");
    }
}
//工厂
class Factory{

    MeizuPhone produce(String product) throws Exception{
        if(product.equals(CommonConstant.PRO5)){
            return new PRO5();
        }else if(product.equals(CommonConstant.PRO6)){
            return new PRO6();
        }else{
            throw new Exception("No such class");
        }
    }
}