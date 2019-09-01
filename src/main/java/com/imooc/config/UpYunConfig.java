package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author MQQ
 * @title: UpYunConfig
 * @projectName sell
 * @description: TODO
 * @date 2019/8/3119:06
 */
@Component
@Data
@ConfigurationProperties("upyun")
public class UpYunConfig {
    private String bucketName;

    private String username;

    private String password;

    /**
     * http://xxx.com/
     */
    private String imageHost;
}
