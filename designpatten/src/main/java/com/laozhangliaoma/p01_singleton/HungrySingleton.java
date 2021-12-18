package com.laozhangliaoma.p01_singleton;

/**
 * 饿汉式
 * @author laozhang
 * @create 2021/12/18 下午3:51
 */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
