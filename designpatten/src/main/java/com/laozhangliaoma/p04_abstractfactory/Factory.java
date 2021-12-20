package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午5:10
 */
public interface Factory {
    /**
     * 创建Button
     * @return
     */
    Button createButton();

    /**
     * 创建Banner
     * @return
     */
    Banner createBanner();
}
