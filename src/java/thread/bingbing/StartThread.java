package thread.bingbing;

/**
 * @ClassName StartThread
 * @descripetion 创建线程方式一：
 * 1、创建：继承Thread+重写run()
 * 2、启动：创建子类对象+start()
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class StartThread extends Thread{

    /**
     * 线程入口点
     * 线程体
     */
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("线程入口");
        }
    }

    public static void main(String[] args) {
        //创建子类对象
        StartThread st = new StartThread();
        //启动
        st.start();//不保证立即运行，由cpu调用
//        st.run();//普通方法调用
        for(int i=0;i<100;i++){
            System.out.println("thread out");
        }
    }
}
