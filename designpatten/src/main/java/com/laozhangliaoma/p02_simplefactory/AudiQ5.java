package com.laozhangliaoma.p02_simplefactory;

/**
 * @author laozhang
 * @create 2021/12/19 上午9:48
 */
public class AudiQ5 implements SUV{
    /**
     * 灯光
     */
    private String light;

    @Override
    public void run() {
        System.out.println("...Audi Q5 running...");
    }
}
