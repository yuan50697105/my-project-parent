package org.myproject.boot.application.admin.api.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BOrderItemQuery {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Long orderId;

    /**
     *
     */
    private Integer orderNo;

    /**
     *
     */
    private Long goodsId;

    /**
     *
     */
    private String goodsCode;

    /**
     *
     */
    private String goodsName;

    /**
     *
     */
    private BigDecimal goodsSinglePrice;

    /**
     *
     */
    private Integer goodsNum;

    /**
     *
     */
    private BigDecimal goodsTotalPrice;
}

