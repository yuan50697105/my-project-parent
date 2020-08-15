package org.myproject.boot.application.commons.pojo;

import lombok.Data;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-14 21:25
 */
@Data
public class SelectVo {
    private String key;
    private Object value;

    public SelectVo(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}