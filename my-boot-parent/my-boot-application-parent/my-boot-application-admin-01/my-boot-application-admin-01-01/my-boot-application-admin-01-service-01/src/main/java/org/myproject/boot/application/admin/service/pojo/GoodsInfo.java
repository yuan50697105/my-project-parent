package org.myproject.boot.application.admin.service.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class GoodsInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Long code;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private BigDecimal price;
    /**
     *
     */
    private Long typeId;
}

