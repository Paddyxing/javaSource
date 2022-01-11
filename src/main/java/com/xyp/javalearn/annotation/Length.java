package com.xyp.javalearn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Length {
    /**
     * 1、注解的定义有点像定义接口 interface，但唯一不同的是前面需要加一个 @符号
     *
     * 2、注解的成员变量只能使用基本类型、 String或者 enum枚举，比如 int可以，但 Integer这种包装类型就不行，需注意
     *
     * 3、像上面 @Target、 @Retention这种加在注解定义上面的注解，我们称为 “元注解”，元注解就是专门用于给注解添加注解的注解，
     *简单理解，元注解就是天生就有的注解，可直接用于注解的定义上
     *
     * 4、 @Target(xxx) 用来说明该自定义注解可以用在什么位置，比如：
     *
     * ElementType.FIELD：说明自定义的注解可以用于类的变量
     *
     * ElementType.METHOD：说明自定义的注解可以用于类的方法
     *
     * ElementType.TYPE：说明自定义的注解可以用于类本身、接口或 enum类型
     *
     * 等等... 还有很多，如果记不住，建议现用现查
     *
     * 5、 @Retention(xxx) 用来说明你自定义注解的生命周期，比如：
     *
     * @Retention(RetentionPolicy.RUNTIME)：表示注解可以一直保留到运行时，因此可以通过反射获取注解信息
     *
     * @Retention(RetentionPolicy.CLASS)：表示注解被编译器编译进 class文件，但运行时会忽略
     *
     * @Retention(RetentionPolicy.SOURCE)：表示注解仅在源文件中有效，编译时就会被忽略
     *
     * 所以声明周期从长到短分别为：RUNTIME > CLASS > SOURCE ，一般来说，如果需要在运行时去动态获取注解的信息，还是得用RUNTIME，就像本文所用。
     */

    int min();
    int max();
    String errorMsg();

}
