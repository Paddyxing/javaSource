package com.xyp.javalearn.service.serializeLearn.modle;

import lombok.Data;

import java.io.*;

@Data
public class User implements Serializable {


    private Integer id;
    private Integer age;
    private String name;

    private static String sex = "男";

    private transient String password = "ccc";


    public static void serialize() throws IOException {
        User user = new User();
        user.setId(3);
        user.setAge(200);
        user.setName("李四");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("user.txt")));
        objectOutputStream.writeObject(user);
        System.out.println("序列化");
        objectOutputStream.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("user.txt")));
        User user = (User) objectInputStream.readObject();
        System.out.println("反序列化");
        System.out.println(user);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {

        //调用默认的反序列化函数
        objectInputStream.defaultReadObject();
        if (0 > age || 200 < age) {
            throw  new IllegalArgumentException("年龄异常！");
        }

    }
}
