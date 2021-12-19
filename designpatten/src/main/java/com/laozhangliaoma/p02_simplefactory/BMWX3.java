package com.laozhangliaoma.p02_simplefactory;

/**
 * @author laozhang
 * @create 2021/12/19 上午9:40
 */
public class BMWX3 implements SUV {
    /**
     * 动力 比如 210P
     */
    private Integer power;

    @Override
    public void run() {
        System.out.println("...BMW X3 running...");
    }

}
