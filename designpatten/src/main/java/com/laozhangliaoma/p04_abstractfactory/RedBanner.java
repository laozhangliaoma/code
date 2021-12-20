package com.laozhangliaoma.p04_abstractfactory;

/**
 * @author laozhang
 * @create 2021/12/19 下午4:58
 */
public class RedBanner implements Banner{
    @Override
    public void render() {
        System.out.println("...red banner render...");
    }
}
