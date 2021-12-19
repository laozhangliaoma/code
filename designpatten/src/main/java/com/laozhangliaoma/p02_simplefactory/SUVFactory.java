package com.laozhangliaoma.p02_simplefactory;

/**
 * @author laozhang
 * @create 2021/12/19 上午9:49
 */
public class SUVFactory {

    public SUV creator(String type) throws Exception{
        if ("Audi".equals(type)){
            return new AudiQ5();
        } else if ("Benz".equals(type)){
            return new BenzGLC();
        } else if ("BMW".equals(type)){
            return new BMWX3();
        }else {
            throw new Exception("type error.");
        }
    }

    public static void main(String[] args) throws Exception{
        SUVFactory factory = new SUVFactory();
        SUV bmw = factory.creator("BMW");
        System.out.println(bmw.getClass().getName());
    }
}
