package thread.bingbing;

/**
 * @ClassName Web12306
 * @descripetion 共享资源
 * 一份资源多个代理会存在，并发问题
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class Web12306 implements Runnable {

    //
    private int ticketNum = 100;

    @Override
    public void run() {
        while (ticketNum>0) {
            if (ticketNum == 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNum--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 w = new Web12306();
        //多个代理
        new Thread(w,"张三").start();
        new Thread(w,"里斯").start();
        new Thread(w,"王五").start();
    }
}
