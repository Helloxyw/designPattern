package com.xyw.designPattern.factory.abstractFactory;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/10/1
 * Time:10:24
 * 抽象工厂模式
 */
public class AbstractFactory {

    public static void main(String[] args) {
        IFactory bigFactory = new BigFactory();
        bigFactory.produceHeadSet().play();
        bigFactory.produceMeizuPhone().run();

        IFactory smallFactory = new SmallFactory();
        smallFactory.produceMeizuPhone().run();
        smallFactory.produceHeadSet().play();
    }

}
//抽象产品 耳机
interface HeadSet{
    void play();
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

class EP21 implements HeadSet{
    @Override
    public void play() {
        System.out.println("This is EP21");
    }
}

class EP22 implements HeadSet{
    @Override
    public void play() {
        System.out.println("This is EP22");
    }
}

//抽象工厂
interface IFactory{
    HeadSet produceHeadSet();
    MeizuPhone produceMeizuPhone();
}

class BigFactory implements IFactory{

    @Override
    public HeadSet produceHeadSet() {
        return new EP21();
    }

    @Override
    public MeizuPhone produceMeizuPhone() {
        return new PRO5();
    }
}

class SmallFactory implements IFactory{

    @Override
    public HeadSet produceHeadSet() {
        return new EP22();
    }

    @Override
    public MeizuPhone produceMeizuPhone() {
        return new PRO6();
    }
}

