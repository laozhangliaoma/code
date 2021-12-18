package com.laozhangliaoma.p01_singleton;

/**
  @author laozhang
  @create 2021/12/18 下午4:36
*/
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
