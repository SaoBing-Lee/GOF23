package io.bingbing;

import java.io.*;

/**
 * @ClassName FileTest
 * @descripetion 打印流
 * @Author liyanbing
 * @Date 2019-09-16
 */
public class PrintTest01 {



    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //打印流
        PrintStream ps = System.out;
        ps.print("打印流");
        ps.print(12);


        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("GOF23/obj.ser")),true);
        ps.print("打印流");
        ps.print(12);
        ps.close();

        //重定向输出端
        System.setOut(ps);
        System.out.println("change");
        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("输出控制台");

    }


}