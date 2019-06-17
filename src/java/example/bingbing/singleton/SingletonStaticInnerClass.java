package example.bingbing.singleton;

/**
 * @ClassName SingletonStaticInnerClass
 * @descripetion 静态内部类 单例模式（也是懒汉式加载方式）线程安全，效率高，实现延迟加载
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class SingletonStaticInnerClass {

    //静态内部类
    private static class SingletonClassInstance{
        private static  final SingletonStaticInnerClass innerClass = new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass(){}

    //没有方法同步，调用效率高。
    public static  SingletonStaticInnerClass getInstance() {
        return SingletonClassInstance.innerClass;
    }

}
