package org.myproject.cloud.application.admin.api.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BGoodsInfoVo implements Serializable {
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
    private Op op;

    public enum Op {
        ADD, UPDATE
    }
}
