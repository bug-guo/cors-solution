package com.luguoyipaishu;

import com.luguoyipaishu.config.CorsMgmtConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:32
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan(basePackages = {"com.luguoyipaishu.filters"})
@ContextConfiguration(classes = CorsMgmtConfig.class)

public class CorsMgmtApp {
    public static void main(String[] args) {
        SpringApplication.run(CorsMgmtApp.class, args);
    }
}
