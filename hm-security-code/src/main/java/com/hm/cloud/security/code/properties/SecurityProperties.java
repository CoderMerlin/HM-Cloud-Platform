package com.hm.cloud.security.code.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
　* @Description: TODO
　* @author Coder编程
　* @date 2020/12/16 16:13
　*/

@ConfigurationProperties(prefix = "hm.cloud.security")
public class SecurityProperties {
    /** hm.cloud.security.browser 路径下的配置会被映射到该配置类中 */
    private BrowserProperties browser = new BrowserProperties();
    private ValidateCodeProperties code = new ValidateCodeProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

}
