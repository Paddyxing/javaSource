package com.xyp.javalearn.service.serializeLearn;

import com.xyp.javalearn.service.serializeLearn.modle.User;

import java.io.IOException;

public class checkService {


    public static void check(){

        User user = new User();
        user.setId(2);
        user.setAge(18);
        user.setName("张三");

        System.out.println(user);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        check();
        User.serialize();
        User.deserialize();
    }


}
