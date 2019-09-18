package example.bingbing.methodfactory;


/**
 * @ClassName Client
 * @descripetion 工厂方法调用
 * @Author liyanbing
 * @Date 2019-06-20
 */
public class Client {

    public static void main(String[] args) {
        Car b = new BenzFactory().createCar();
        Car f = new FerrariFactory().createCar();

        f.run();
        b.run();
    }

}
