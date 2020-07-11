package org.myproject.boot.application.admin.mvc.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 路由表
 */
@Data
public class SysRoute implements Serializable {
    private Long id;

    private String url;

    private String name;

    private Long parentId;

    private Integer weight;

    private static final long serialVersionUID = 1L;
}