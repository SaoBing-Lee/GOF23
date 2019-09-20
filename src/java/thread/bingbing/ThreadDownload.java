package thread.bingbing;

/**
 * @ClassName ThreadDownload
 * @descripetion TODO
 * @Author liyanbing
 * @Date 2019-09-19
 */
public class ThreadDownload extends Thread {

    private String url;//远程路径
    private String name;//存储名字

    public ThreadDownload(){}
    public  ThreadDownload(String url ,String name ){
        this.name=name;
        this.url=url;
    }

    @Override
    public void run(){
        WebDownload wd = new WebDownload();
        wd.download(url,name);
        System.out.println(name);//打印名字，查看下载顺序
    }

    public static void main(String[] args) {
        ThreadDownload td1 = new ThreadDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568885568411&di=d88fcd0806018156f64f80f6b5be2d57&imgtype=0&src=http%3A%2F%2Fimg.juimg.com%2Ftuku%2Fyulantu%2F130714%2F325449-130G40SQ847.jpg","zgm.jpg");
        ThreadDownload td2 = new ThreadDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568885568412&di=b623be0ca7a35e235124f4238d64352f&imgtype=0&src=http%3A%2F%2Fpic72.nipic.com%2Ffile%2F20150719%2F21011915_144237691000_2.jpg","niao.jpg");
        ThreadDownload td3 = new ThreadDownload("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1568885568411&di=29e8c9acdbb0213c8b83429e6fc836a6&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20160916%2Ffc3d9d188d4d48e8a0a48b9663d2adb4_th.jpg","long.jpg");

        //启动线程
        td1.start();
        td2.start();
        td3.start();

    }
}
