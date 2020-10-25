package com.luguoyipaishu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:32
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CorsMgmtApp {
    public static void main(String[] args) {
        SpringApplication.run(CorsMgmtApp.class, args);
    }
}
