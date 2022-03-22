package com.xyp.javalearn.service;

import java.time.LocalDateTime;

public class Test {


    public static void main(String args[]){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(true ? 1 : false ? 0 : 2);

        now.plusYears(2);
        now.minusMonths(1);
    }


}

