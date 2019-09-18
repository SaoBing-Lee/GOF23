package example.bingbing.simplefactory;

/**
 * @ClassName Benci
 * @descripetion 奔驰
 * @Author liyanbing
 * @Date 2019-06-19
 */
public class Benz implements Car{
    //具体的实现方法
    @Override
    public void run() {
        System.out.println("奔驰跑起来");
    }
}
