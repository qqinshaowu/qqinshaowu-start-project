package com.qqinshaowu.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *启动类
 *
 * @author qqinshaowu
 * @since: 1.0.0
 */
@EnableWebMvc
@SpringBootApplication(scanBasePackages = "com.qqinshaowu")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
