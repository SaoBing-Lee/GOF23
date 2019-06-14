package example.bingbing.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName Client
 * @descripetion 测试多线程环境下单例模式的效率
 * @Author liyanbing
 * @Date 2019-06-13
 */
public class Client3 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        //线程计数器
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);//设置为final 这样内部类才能调用

        for (int a = 0; a < threadNum; a++) {
            new Thread(new Runnable() {//匿名内部类
                @Override
                public void run() {

                    for (int i = 0; i < 10000000; i++) {
                       // Object o = SingletonLazyLoad.getInstance();
                        Object o = SingletonEnum.INSTANTS;
                    }
                    countDownLatch.countDown();//计数器减 1
                }
            }).start();
        }

        countDownLatch.await();//main线程阻塞，直到计数器变为0，才会继续往下执行；
        long end = System.currentTimeMillis();
        System.out.println("总耗时：======"+(end-start));
    }
}
