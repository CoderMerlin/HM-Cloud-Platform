package com.hm.cloud.common.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
  * @description: Excel注解集
  * @author Merlin
  * 欢迎关注公众号：Coder编程 
  * 网站：http://coder-programming.cn/
  * @date 2020/12/21  14:16
  */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Excels
{
    Excel[] value();
}
