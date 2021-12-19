package com.laozhangliaoma.p03_factorymethod;

/**
 * @author laozhang
 * @create 2021/12/19 上午9:44
 */
public class BenzGLC implements SUV {
    /**
     * 颜色 比如红色
     */
    private String color;

    @Override
    public void run() {
        System.out.println("...Benz GLC running...");
    }
}
