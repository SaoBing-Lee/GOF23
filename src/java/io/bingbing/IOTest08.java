package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class IOTest08 {

    /**
     * 创建源
     * 选择流
     * 操作（读写内容）
     * 释放资源
     *
     * @param args
     */
    public static void main(String[] args) {
        byte[] fileByte = fileToByteArray("GOF23/filetest.png");
        System.out.println(fileByte.length);

        byteArrayToFile("GOF23/fileTest08.png",fileByte);
    }

    /**
     * 图片读取到字节数组
     * 1、图片到程序 FileInputStream
     * 2、程序到字节数组  ByteArrayOutputStream
     * @param filePath 图片路径
     */
    public static byte[] fileToByteArray(String filePath) {
        //创建源
        File i = new File(filePath);
        //选择流
        FileInputStream is = null;

        //选择流
        ByteArrayOutputStream baos = null;

        try {
            is = new FileInputStream(i);
            baos = new ByteArrayOutputStream();
            //操作（分段读取）
            byte[] fulsh = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(fulsh)) != -1) {
                baos.write(fulsh, 0, len);
            }
            baos.flush(); //刷新
            //获取数据
            return baos.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 字节数组写出图片
     * 1、字节数组到程序  ByteArrayInputStream
     * 2、程序到图片  FileOutputStream
     * @param filePath 输出路径
     * @param src 图片字节数组
     */
    public static void byteArrayToFile(String filePath,byte [] src) {
        //创建源
        File out = new File(filePath);
        //选择流
        OutputStream os = null;
        //选择流
        InputStream is = null;
        try {
            os = new FileOutputStream(out);
            is = new ByteArrayInputStream(src);
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
        }
    }

}
