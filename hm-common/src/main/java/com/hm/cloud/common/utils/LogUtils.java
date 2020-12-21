package com.hm.cloud.common.utils;

/**
 * @author Merlin
 * 欢迎关注公众号：Coder编程
 * 网站：http://coder-programming.cn/
 * @description: 处理并记录日志文件
 * @date 2020/12/21  13:39
 */

public class LogUtils {
    public static String getBlock(Object msg) {
        if (msg == null) {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
