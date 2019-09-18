package example.bingbing.simplefactory;

/**
 * @ClassName Client2
 * @descripetion 简单工厂调用
 * @Author liyanbing
 * @Date 2019-06-21
 */
public class Client2 {

    public static void main(String[] args) {
        Car c1 =  CarFactory.createBenz();
        Car c2 =  CarFactory.createFerrari();

        c1.run();
        c2.run();
    }
}
