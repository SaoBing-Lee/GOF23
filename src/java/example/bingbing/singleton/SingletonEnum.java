package example.bingbing.singleton;

/**
 * @ClassName SingletonStaticInnerClass
 * @descripetion 枚举实现单例模式（没有延时加载，效率高）
 * 避免通过反射和反序列化的漏洞
 * @Author liyanbing
 * @Date 2019-06-13
 */
public enum SingletonEnum {


    //枚举元素，本身就是单例对象！
    INSTANTS;

    //添加自己需要的操作
    public void singletonOperation(){

    }

}
