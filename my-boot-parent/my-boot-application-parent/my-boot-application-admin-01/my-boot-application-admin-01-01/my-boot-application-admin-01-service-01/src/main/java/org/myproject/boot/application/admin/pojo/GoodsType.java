package org.myproject.boot.application.admin.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class GoodsType implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private String name;
}

