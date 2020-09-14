package org.dy.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/29 18:06
 */
@EnableTransactionManagement
@SpringBootApplication
public class SysApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class, args);
    }
}