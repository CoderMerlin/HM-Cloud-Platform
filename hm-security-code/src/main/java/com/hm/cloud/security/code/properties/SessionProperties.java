package com.hm.cloud.security.code.properties;

/**
　* @Description: session配置
　* @author Coder编程
　* @date 2020/12/16 16:13
　*/

public class SessionProperties {
    /** 允许同一个用户名同时在线的session个数 */
    private int maximumSessions = 1;
    /** 当session达到最大值后，是阻止用户登录还是剔除掉已登录用户
     * fasle ： 会走{@link cn.hm.cloud.admin.auth.strategy.CustomExpiredSessionStrategy}
     * true：会阻止登录，这个阻止登录的个性化消息没有设置，看源码的时候好像可以覆盖那个过滤器；设置为true会看到报错信息，然后就可以查看覆盖说明了
     * */
    private boolean maxSessionsPreventsLogin;
    /**
     * session失效时跳转的地址
     */
    private String sessionInvalidUrl = SecurityConstants.DEFAULT_SESSION_INVALID_URL;

    public int getMaximumSessions() {
        return maximumSessions;
    }

    public void setMaximumSessions(int maximumSessions) {
        this.maximumSessions = maximumSessions;
    }

    public boolean isMaxSessionsPreventsLogin() {
        return maxSessionsPreventsLogin;
    }

    public void setMaxSessionsPreventsLogin(boolean maxSessionsPreventsLogin) {
        this.maxSessionsPreventsLogin = maxSessionsPreventsLogin;
    }

    public String getSessionInvalidUrl() {
        return sessionInvalidUrl;
    }

    public void setSessionInvalidUrl(String sessionInvalidUrl) {
        this.sessionInvalidUrl = sessionInvalidUrl;
    }
}
