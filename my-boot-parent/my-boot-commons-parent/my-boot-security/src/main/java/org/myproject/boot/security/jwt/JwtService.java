package org.myproject.boot.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.myproject.boot.security.jwt.properties.JwtProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: my-boot-security
 * @description:
 * @author: yuane
 * @create: 2020-07-05 10:32
 */
@Component
@EnableConfigurationProperties(JwtProperties.class)
public class JwtService {
    @Autowired
    private JwtProperties properties;

    public String createToken(String username) {
        return Jwts.builder().setSubject(username).signWith(SignatureAlgorithm.HS512, properties.getSignKey()).setExpiration(new Date(System.currentTimeMillis() + properties.getTimeOut())).compact();
    }

    public Claims getBody(String token) {
        return Jwts.parser().setSigningKey(properties.getSignKey()).parseClaimsJws(token).getBody();
    }

    public String getSubject(String token) {
        return getBody(token).getSubject();
    }


}