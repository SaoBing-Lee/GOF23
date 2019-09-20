package thread.bingbing;

/**
 * @ClassName RacerRunnable
 * @descripetion 龟兔赛跑
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class RacerRunnable implements Runnable {

    private String winner;//胜利
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            //模拟休息
            if(Thread.currentThread().getName().equals("rabbit") && i%10==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            //判断比赛是否结束
            if(gameOver(i)){
                break;
            }
        }
    }

    private boolean gameOver(int i){
        if(winner != null){//存在胜利
            return true;
        }else{
            if(i==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner"+winner);
                return true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        RacerRunnable rr =new RacerRunnable();
        new Thread(rr,"tortoise").start();
        new Thread(rr,"rabbit").start();
    }
}
