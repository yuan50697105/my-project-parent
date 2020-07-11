package org.myproject.boot.application.admin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GoodsInfoVo implements Serializable {
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

    private static final long serialVersionUID = 1L;
}

