package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRouteVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private String url;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Long parentId;
    /**
     *
     */
    private Integer weight;
}
