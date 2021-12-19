package com.laozhangliaoma.p03_factorymethod;

/**
 * 宝马SUV工厂
 * @author laozhang
 * @create 2021/12/19 下午2:45
 */
public class BMWFactory implements IFactory{
    @Override
    public SUV create() {
        return new BMWX3();
    }
}
