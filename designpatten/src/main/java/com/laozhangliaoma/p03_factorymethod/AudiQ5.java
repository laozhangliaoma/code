package com.laozhangliaoma.p03_factorymethod;

/**
 * @author laozhang
 * @create 2021/12/19 δΈε9:48
 */
public class AudiQ5 implements SUV {
    /**
     * η―ε
     */
    private String light;

    @Override
    public void run() {
        System.out.println("...Audi Q5 running...");
    }
}
