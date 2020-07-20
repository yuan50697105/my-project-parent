package org.myproject.cloud.application.admin.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@Accessors(chain = true)
public class BOrderItemQuery extends BBaserQuery implements Serializable {
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

