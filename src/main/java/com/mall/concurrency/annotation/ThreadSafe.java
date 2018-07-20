package com.mall.concurrency.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记线程安全的类或者写法
 */
@Target(ElementType.TYPE)
//用来表示范围，source代表这个注解在编译时就会被忽略，意味着这个注解只是让我们在编写代码时
//懂这个是什么意思即可
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {

    String value() default  "";
}
