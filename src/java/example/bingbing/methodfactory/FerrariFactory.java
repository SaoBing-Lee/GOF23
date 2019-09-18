package example.bingbing.methodfactory;

/**
 * @ClassName FerrariFactory
 * @descripetion 创建具体工厂
 * @Author liyanbing
 * @Date 2019-06-20
 */
public class FerrariFactory implements CarFactory {

    @Override
    public Car createCar() {
        return  new Ferrari();
    }
}
