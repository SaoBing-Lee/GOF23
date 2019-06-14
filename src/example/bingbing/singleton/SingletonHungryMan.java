package example.bingbing.singleton;


/**
 * @ClassName Singleton
 * @descripetion 饿汉式单例模式（单例对象立即加载）
 * 饿汉式单例模式中，static变量会子啊类加载时初始化，此时不会涉及多个线程访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题，因此可以省略synchronized关键字
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class SingletonHungryMan {

    //类初始化时，立即加载这个对象（没有延时加载的优势）！由于加载类时，天然的线程安全的！
    private static SingletonHungryMan singletonHungryMan = new SingletonHungryMan();

    private SingletonHungryMan() {
    }

    //方法没有同步，调用效率高。（static变量会子啊类加载时初始化，此时不会涉及多个线程访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题，因此可以省略synchronized关键字）
    public static SingletonHungryMan getInstance() {
        return singletonHungryMan;
    }

}
