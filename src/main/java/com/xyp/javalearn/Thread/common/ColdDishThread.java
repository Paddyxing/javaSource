package com.xyp.javalearn.Thread.common;


import lombok.Data;

@Data
public class ColdDishThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("凉菜准备完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}