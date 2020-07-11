package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class GoodsInfoQuery implements Serializable {
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

