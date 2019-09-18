package example.bingbing.simplefactory;

/**
 * @ClassName Client
 * @descripetion 非工厂方法调用
 * @Author liyanbing
 * @Date 2019-06-20
 */
public class Client {

    public static void main(String[] args) {
        Car b = new Benz();
        Car f = new Ferrari();

        f.run();
        b.run();
    }

}
