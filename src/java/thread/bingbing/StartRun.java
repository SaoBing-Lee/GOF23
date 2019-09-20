package thread.bingbing;

/**
 * @ClassName StartRun
 * @descripetion 创建线程方式2：
 * 1、创建：继承Thread+重写run()
 * 2、启动：创建实现类对象+创建Thread+start()
 * 推荐使用：避免单继承的局限性，优先使用接口，方便共享资源
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class StartRun implements Runnable {
    /**
     * 线程入口点
     * 线程体
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程入口");
        }
    }

    public static void main(String[] args) {
        //创建实现类对象
//        StartRun sr = new StartRun();
//
//        //创建代理类对象
//        Thread st = new Thread(sr);
//        //启动
//        st.start();//不保证立即运行，由cpu调用
        new Thread(new StartRun()).start();//只使用一次的对象，使用匿名

        for (int i = 0; i < 100; i++) {
            System.out.println("thread out");
        }
    }
}
