package com.xyp.javalearn.service.fuctioncoding;

import com.xyp.javalearn.service.serializeLearn.modle.User;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class checkService {

    private static  List<String> list = new ArrayList<>(Arrays.asList("1123134", "2", "bilibili", "of", "codesheep", "5", "at", "BILIBILI", "codesheep", "23", "CHEERS", "6"));

    public static void main(String[] args) {

        /** stream 接口**/

        String result = list.stream()
                .filter(i -> !isNum(i))
                .filter(i -> i.length()>=5)
                .map(i -> i.toLowerCase())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining("❤"));

        System.out.println("##");
        System.out.println(result);
        System.out.println("##");
        lambda();
        function();

    }

    private static boolean isNum(String str ) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /** consumer 接口   消费者的含义”，接受参数而不返回值 **/
    /**  Lambda  表达式 **/
    public static void lambda(){
        // java7
        for (String s : list) {
            System.out.println(s);
        }
        // java8
        // ::  方法引用是与lambda表达式相关的一个重要特性。它提供了一种不执行方法的方法。为此，方法引用需要由兼容的函数接口组成的目标类型上下文
        /*以下是Java 8中方法引用的一些语法：
        静态方法引用（static method）语法：classname::methodname 例如：Person::getAge
        对象的实例方法引用语法：instancename::methodname 例如：System.out::println
        对象的超类方法引用语法： super::methodname
        类构造器引用语法： classname::new 例如：ArrayList::new
        数组构造器引用语法： typename[]::new 例如： String[]:new*/
        System.out.println("##");
        list.forEach(System.out::println);

        Consumer consumer = System.out::println;
        consumer.accept("hello");
        consumer.accept("world");
    }

    /** Funvtion 接口   Function既有输入，也有输出，使用更加灵活**/
    public static void function(){
        Function<Integer,Integer> f1 = i -> i*i;
        Function<Integer, Integer> f2 = i -> i + i;
        Consumer consumer = System.out::println;
        consumer.accept(f1.andThen(f2).apply(2));

        consumer.accept(f2.apply(5));

    }

    /**
     * Optional 接口  本质是个容器，你可以将你的变量交由它进行封装，这样我们就不用显式对原变量进行 null值检测，防止出现各种空指针异常
     **/

    public static int option(User user) {
        return Optional.ofNullable(user).map(User::getAge).orElse(null);
    }


}
