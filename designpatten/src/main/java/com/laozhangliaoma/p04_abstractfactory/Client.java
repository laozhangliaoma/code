package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午5:22
 */
public class Client {
    public static void main(String[] args) {
        //生产蓝色风格产品
        Factory factory = new BlueStyleFactory();
        Button button = factory.createButton();
        Banner banner = factory.createBanner();
        button.click();
        banner.render();

        System.out.println("--------------------------");

        // 生产红色风格产品
        factory = new RedStyleFactory();
        button = factory.createButton();
        banner = factory.createBanner();
        button.click();
        banner.render();

    }
}
