package com.laozhangliaoma.p06_prototype;

/**
 * @author laozhang
 * @create 2021/12/20 下午4:04
 */
public class Client {
    public static void main(String[] args)  {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        ConcretePrototype concretePrototype1 = (ConcretePrototype) concretePrototype.clone();
        System.out.println("prototype-->" + concretePrototype);
        System.out.println("prototype1-->" + concretePrototype1);
    }
}
