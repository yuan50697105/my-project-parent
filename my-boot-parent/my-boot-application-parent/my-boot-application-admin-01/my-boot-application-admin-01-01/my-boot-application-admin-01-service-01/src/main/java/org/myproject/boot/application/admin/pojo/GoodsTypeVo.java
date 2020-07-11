package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsTypeVo implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String name;

    private static final long serialVersionUID = 1L;
}

