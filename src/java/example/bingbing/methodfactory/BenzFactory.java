package example.bingbing.methodfactory;

/**
 * @ClassName BenzFactory
 * @descripetion 创建具体工厂
 * @Author liyanbing
 * @Date 2019-06-20
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }
}
