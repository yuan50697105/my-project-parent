package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BGoodsTypeQuery implements Serializable {
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

