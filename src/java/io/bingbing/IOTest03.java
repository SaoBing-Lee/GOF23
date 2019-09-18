package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 文件拷贝：字节输入、输出流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest03 {

    /**
     * 创建源
     * 选择流
     * 操作（读写内容）
     * 释放资源
     * @param args
     */
    public static void main(String[] args) {
        copyFile("GOF23/filetest.png","GOF23/copyTest2.png");

    }

    public static void copyFile(String srcPath,String destPath){
        //源头
        File i = new File(srcPath);
        //选择流
        FileInputStream is = null;
        //目的地
        File out = new File(destPath);
        //选择流
        OutputStream os = null;

        try {
            is = new FileInputStream(i);
            os = new FileOutputStream(out);


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
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
