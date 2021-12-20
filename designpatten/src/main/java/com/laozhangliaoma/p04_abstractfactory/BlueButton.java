package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午4:56
 */
public class BlueButton implements Button{
    /**
     * 颜色
     */
    private String color;

    @Override
    public void click() {
        System.out.println("...blue button click...");
    }
}
