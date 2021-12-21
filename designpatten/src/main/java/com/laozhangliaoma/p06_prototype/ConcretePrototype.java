package com.laozhangliaoma.p06_prototype;

/**
 * @author laozhang
 * @create 2021/12/20 下午4:03
 */
public class ConcretePrototype implements Prototype{
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
