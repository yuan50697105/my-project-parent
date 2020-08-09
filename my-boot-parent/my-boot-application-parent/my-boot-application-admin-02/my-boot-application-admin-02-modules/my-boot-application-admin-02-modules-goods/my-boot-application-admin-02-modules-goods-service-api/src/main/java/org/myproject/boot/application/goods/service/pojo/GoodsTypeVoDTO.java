package org.myproject.boot.application.goods.service.pojo;

import lombok.Data;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:42
 */
@Data
public class GoodsTypeVoDTO {
    private Event event;
    private Long id;
    private String name;
    private String description;

    public enum Event {
        ADD, UPDATE
    }

}