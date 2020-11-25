package com.luguoyipaishu;

import com.luguoyipaishu.config.BasedInterceptorCorsConfig;
import com.luguoyipaishu.config.CorsMgmtConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author 路过一排树
 * @date 2020/11/25 22:32
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ContextConfiguration(classes = CorsMgmtConfig.class)
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BasedInterceptorCorsConfig.class)})
public class CorsMgmt {
    public static void main(String[] args) {
        SpringApplication.run(CorsMgmt.class, args);
    }
}
