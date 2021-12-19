package com.laozhangliaoma.p03_factorymethod;

/**
 * @author laozhang
 * @create 2021/12/19 下午2:48
 */
public class Client {
    public static void main(String[] args) {
        //需要什么SUV,就创建具体的工厂去创建
//        IFactory factory = new AudiFactory();
        IFactory factory = new BenzFactory();
        SUV suv = factory.create();
        System.out.println(suv.getClass().getName());
    }
}
