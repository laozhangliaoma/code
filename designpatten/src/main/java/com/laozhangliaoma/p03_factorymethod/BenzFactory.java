package com.laozhangliaoma.p03_factorymethod;

/**
 * Benz SUV工厂
 * @author laozhang
 * @create 2021/12/19 下午2:46
 */
public class BenzFactory implements IFactory {
    @Override
    public SUV create() {
        return new BenzGLC();
    }
}
