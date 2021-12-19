package com.laozhangliaoma.p03_factorymethod;

/**
 * 抽象工厂
 * @author laozhang
 * @create 2021/12/19 下午2:43
 */
public interface IFactory {
    /**
     * 生产SUV
     * @return
     */
    SUV create();
}
