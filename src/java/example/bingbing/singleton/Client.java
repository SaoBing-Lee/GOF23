package example.bingbing.singleton;
/**
 * @ClassName Client
 * @descripetion TODO
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class Client {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANTS;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANTS;
        SingletonHungryMan man = SingletonHungryMan.getInstance();
        SingletonHungryMan man2 = SingletonHungryMan.getInstance();
        SingletonLazyLoad lazyLoad = SingletonLazyLoad.getInstance();
        SingletonLazyLoad lazyLoad2 = SingletonLazyLoad.getInstance();
        SingletonStaticInnerClass innerClass = SingletonStaticInnerClass.getInstance();
        SingletonStaticInnerClass innerClass2 = SingletonStaticInnerClass.getInstance();

        System.out.println(singletonEnum);
        System.out.println(singletonEnum2);
        System.out.println(man2);
        System.out.println(man);
        System.out.println(lazyLoad);
        System.out.println(lazyLoad2);
        System.out.println(innerClass);
        System.out.println(SingletonEnum.INSTANTS==SingletonEnum.INSTANTS);
    }
}
