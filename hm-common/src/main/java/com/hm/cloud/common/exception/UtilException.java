package com.hm.cloud.common.exception;


/**
  * @description:
  * @author Merlin
  * 欢迎关注公众号：Coder编程 
  * 网站：http://coder-programming.cn/
  * @date 2020/12/17  16:21
  */

public class UtilException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable e) {
        super(e.getMessage(), e);
    }

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
