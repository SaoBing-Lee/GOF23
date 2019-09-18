package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 字节数组输入流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest06 {

    /**
     * 创建源  :字节数组不要太大
     * 选择流
     * 操作（读写内容）
     * 释放资源 ：可以不用处理
     * @param args
     */
    public static void main(String[] args) {
        //创建源
        byte [] src = "talk is cheap show me the code!".getBytes();
        //选择流
        InputStream is = null;
        try {
            is = new ByteArrayInputStream(src);
            //操作（分段读取）
            byte[] fulsh = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(fulsh)) != -1) {
                String str = new String(fulsh, 0, len);//字节数组--》字符串   解码
                System.out.println(str);
            }

        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
