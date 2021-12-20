package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午5:16
 */
public class RedStyleFactory implements Factory{
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Banner createBanner() {
        return new RedBanner();
    }
}
