package com.luguoyipaishu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:31
 */
@Configuration
@ComponentScan(basePackages = {
        "com.luguoyipaishu.controller",
        "com.luguoyipaishu.service"
        , "com.luguoyipaishu.filters"   // 扫描并加载过滤器
})
public class CorsMgmtConfig {
}
