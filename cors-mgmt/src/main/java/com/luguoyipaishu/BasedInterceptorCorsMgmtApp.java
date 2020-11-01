package com.luguoyipaishu;

import com.luguoyipaishu.config.BasedInterceptorCorsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 路过一排树
 * @date 2020/10/29 22:29
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BasedInterceptorCorsMgmtApp {
    public static void main(String[] args) {
        SpringApplication.run(BasedInterceptorCorsConfig.class, args);
    }

}
