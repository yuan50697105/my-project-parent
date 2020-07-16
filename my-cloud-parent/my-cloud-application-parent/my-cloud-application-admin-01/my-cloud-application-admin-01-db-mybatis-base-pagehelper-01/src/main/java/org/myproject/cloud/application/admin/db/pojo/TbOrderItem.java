package org.myproject.cloud.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单项目
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbOrderItem extends BaseEntity implements Serializable {
    private Long orderId;

    private Integer orderNo;

    private Long goodsId;

    private String goodsCode;

    private String goodsName;

    private BigDecimal goodsSinglePrice;

    private Integer goodsNum;

    private BigDecimal goodsTotalPrice;

    private static final long serialVersionUID = 1L;
}