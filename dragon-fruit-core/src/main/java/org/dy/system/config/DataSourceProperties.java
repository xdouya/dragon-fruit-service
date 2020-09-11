package org.dy.system.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类说明
 *
 * @author caiwenlao
 * @date 2020/3/29 16:16
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DataSourceProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String filters;
    private int initialSize;
    private int minIdle;
    private int maxActive;
    private long maxWait;
    private long minEvictableIdleTimeMillis;
}
