package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 文件拷贝：字节输入、输出流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class BufferdCopy {

    /**
     * 创建源
     * 选择流
     * 操作（读写内容）
     * 释放资源
     * @param args
     */
    public static void main(String[] args) {
        //选择流
        try {
            InputStream is = new BufferedInputStream(new FileInputStream("GOF23/filetest.png"));
            OutputStream os = new BufferedOutputStream(new FileOutputStream("GOF23/copy_buffer.png"));
//            InputStream is = new FileInputStream("GOF23/test.pptx");
//            OutputStream os = new FileOutputStream("GOF23/copy_buffer.pptx");
            long t1=System.currentTimeMillis();
            copyFile(is,os);
            long t2=System.currentTimeMillis();
            System.out.println(t2-t1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //选择流

    }

    public static void copyFile(InputStream is,OutputStream os ){
        try {
            //操作（分段读取）
            byte[] fulsh = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(fulsh)) != -1) {
                os.write(fulsh,0,len);
            }
            os.flush(); //刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            close(is,os);//调用方法，有多少参数传多少参数
        }
    }

    /**
     * 封装关闭流方法（InputStream ，OutputStream 实现Closeable ；所以可以直接创建：Closeable... 可变参数）
     * @param ios
     */
    public static void close(Closeable... ios){
        for (Closeable io:ios) {
            try {
                io.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
