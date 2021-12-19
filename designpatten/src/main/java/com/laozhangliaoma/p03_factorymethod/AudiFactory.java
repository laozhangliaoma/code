package com.laozhangliaoma.p03_factorymethod;

/**
 * Audi SUV 工厂
 * @author laozhang
 * @create 2021/12/19 下午2:47
 */
public class AudiFactory implements IFactory{
    @Override
    public SUV create() {
        return new AudiQ5();
    }
}
