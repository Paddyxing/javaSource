package com.xyp.javalearn.service.thread;

import lombok.Data;
import lombok.Synchronized;

/**
 * @author: paddy
 * Date: 2022/2/28
 * Time: 15:03
 * Description:
 */
@Data
public class ThreadLocalDemo {

    private String content;


    public static void main2(String[] args) {
        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                threadLocalDemo.setContent(Thread.currentThread().getName() + "的数据");
                System.out.println("--------------------------------------------");
                System.out.println(Thread.currentThread().getName() + "\t " + threadLocalDemo.getContent());
            }, String.valueOf(i)).start();
        }
    }

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"开始 \n");
                threadLocal.set(Thread.currentThread().getName() + "的数据");
                System.out.println(Thread.currentThread().getName()+"--------------------------------------------");
                System.out.println(Thread.currentThread().getName() + "\t " + threadLocal.get());
            }, String.valueOf(i)).start();
        }
    }
}
