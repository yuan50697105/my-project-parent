package org.myproject.boot.security.jwt.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: my-boot-security
 * @description:
 * @author: yuane
 * @create: 2020-07-05 10:35
 */
@Data
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {
    /**
     * JWT 签名
     */
    private String signKey;
    /**
     * 超时时间，单位毫秒
     */
    private Long timeOut;
}