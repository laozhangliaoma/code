package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午5:14
 */
public class BlueStyleFactory implements Factory{
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public Banner createBanner() {
        return new BlueBanner();
    }
}
