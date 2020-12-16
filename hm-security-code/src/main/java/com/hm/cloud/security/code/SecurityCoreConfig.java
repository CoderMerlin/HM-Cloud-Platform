package com.hm.cloud.security.code;

import com.hm.cloud.security.code.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
　* @Description:
 * 让SecurityProperties这个配置类生效
 * EnableConfigurationProperties 的作用是标明加载哪一个类
 * 这效果和直接在目标类上写上@Configuration效果一样
　* @author Coder编程
　* @date 2020/12/16 16:26
　*/

@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}