package example.bingbing.singleton;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName Singleton
 * @descripetion 饿汉式单例模式（单例对象立即加载）
 * 饿汉式单例模式中，static变量会子类加载时初始化，此时不会涉及多个线程访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题，因此可以省略synchronized关键字
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class SingletonHungryMan implements Serializable {

    //类初始化时，立即加载这个对象（没有延时加载的优势）！由于加载类时，天然的线程安全的！
    private static SingletonHungryMan singletonHungryMan = new SingletonHungryMan();

    private SingletonHungryMan() {
        //添加判断如果存在对象，证明已经创建，不需要在创建，抛出异常（防止通过反射破解单例模式）
        if(singletonHungryMan != null){
            throw new RuntimeException();
        }
    }

    //方法没有同步，调用效率高。（static变量会子类加载时初始化，此时不会涉及多个线程访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题，因此可以省略synchronized关键字）
    public static SingletonHungryMan getInstance() {
        return singletonHungryMan;
    }


    /**
     * 反序列化是，如果定义了readResolve（），则直接返回此方法的指定对象，而不需要单独再创建新的对象
     * 这个方法是基于回调的，反序列化时，如果定义了readResolve()则直接返回此方法指定的对象，而不需要在创建新的对象！
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException{
        return singletonHungryMan;
    }

}
