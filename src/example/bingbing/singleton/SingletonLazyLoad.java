package example.bingbing.singleton;

/**
 * @ClassName SingletonLazyLoad
 * @descripetion 懒汉式（单例对象延迟加载）,真正用的时候才加载
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class SingletonLazyLoad {

    //类初始化时，立即加载这个对象（延时加载的优势,真正用的时候才加载）！由于加载类时，天然的线程安全的！
    private static SingletonLazyLoad singletonLazyLoad;

    //私有化构造器
    private SingletonLazyLoad() {
    }

    //方法同步，调用效率不高。
    public static synchronized SingletonLazyLoad getInstance() {
        if (singletonLazyLoad == null) {
            singletonLazyLoad = new SingletonLazyLoad();
        }
        return singletonLazyLoad;
    }

}
