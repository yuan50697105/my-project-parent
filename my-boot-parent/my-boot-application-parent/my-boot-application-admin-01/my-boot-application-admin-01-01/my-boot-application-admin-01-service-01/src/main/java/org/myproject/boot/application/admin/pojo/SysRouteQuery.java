package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRouteQuery implements Serializable {
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

    private static final long serialVersionUID = 1L;
}

