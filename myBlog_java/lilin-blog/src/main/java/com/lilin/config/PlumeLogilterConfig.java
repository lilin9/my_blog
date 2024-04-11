package com.lilin.config;

import com.plumelog.core.TraceIdFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * Created by LILIN on 2024/3/10/20:25:06
 */
@Configuration
public class PlumeLogilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(initCustomFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(Integer.MIN_VALUE);
        return filterRegistrationBean;
    }

    @Bean
    public Filter initCustomFilter() {
        return new TraceIdFilter();
    }
}
