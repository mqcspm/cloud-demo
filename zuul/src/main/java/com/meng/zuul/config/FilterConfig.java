package com.meng.zuul.config;

import com.meng.zuul.filter.LoginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 过滤器配置
 */
@Configuration
public class FilterConfig {

    @Bean
    public LoginFilter loginFilter(){
        return new LoginFilter();
    }
}
