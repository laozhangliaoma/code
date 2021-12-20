package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午4:59
 */
public class BlueBanner implements Banner{
    @Override
    public void render() {
        System.out.println("...blue banner render...");
    }
}
