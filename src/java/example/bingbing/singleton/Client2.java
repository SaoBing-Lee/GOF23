package example.bingbing.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @ClassName Client
 * @descripetion 通过反射破解单例模式（可以在构造器方法中手动抛出异常控制 -- 防止破解）
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        SingletonHungryMan man = SingletonHungryMan.getInstance();
        SingletonHungryMan man2 = SingletonHungryMan.getInstance();
        System.out.println(man);
//        System.out.println(man2);
//        //通过反射调用私有构造器
//        Class<SingletonHungryMan> clazz = (Class<SingletonHungryMan>) Class.forName("example.bingbing.singleton.SingletonHungryMan");
//        Constructor<SingletonHungryMan> c = clazz.getDeclaredConstructor(null);
//
//        c.setAccessible(true);//跳过权限的检查，如果不跳过会报错：如下
//        /**
//         * Exception in thread "main" java.lang.IllegalAccessException: Class example.bingbing.singleton.Client2 can not access
//         * a member of class example.bingbing.singleton.SingletonHungryMan with modifiers "private"
//         * 	at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)
//         * 	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(AccessibleObject.java:296)
//         * 	at java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:288)
//         * 	at java.lang.reflect.Constructor.newInstance(Constructor.java:413)
//         * 	at example.bingbing.singleton.Client2.main(Client2.java:18)
//         */
//
//        SingletonHungryMan s1 = c.newInstance();
//        SingletonHungryMan s2 = c.newInstance();
//        System.out.println(s1);
//        System.out.println(s2);

        //通过反序列化方式构造多个对象
        FileOutputStream fos = new FileOutputStream("/Users/ydm12/study/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(man);
        oos.close();
        fos.close();

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/ydm12/study/a.txt"));
        SingletonHungryMan s3 = (SingletonHungryMan) ois.readObject();
        System.out.println(s3);


        // SingletonHungryMan 对象没有实现  Serializable
        /**
         * Exception in thread "main" java.io.NotSerializableException: example.bingbing.singleton.SingletonHungryMan
         * 	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
         * 	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
         * 	at example.bingbing.singleton.Client2.main(Client2.java:42)
         */

    }
}
