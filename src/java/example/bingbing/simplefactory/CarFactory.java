package example.bingbing.simplefactory;

/**
 * @ClassName CarFactory
 * @descripetion 简单工厂模式（静态工厂）
 * @Author liyanbing
 * @Date 2019-06-20
 */
public class CarFactory {

    public static Car createBenz(){
        return new Benz();
    }
    public static Car createFerrari(){
        return new Ferrari();
    }
}
