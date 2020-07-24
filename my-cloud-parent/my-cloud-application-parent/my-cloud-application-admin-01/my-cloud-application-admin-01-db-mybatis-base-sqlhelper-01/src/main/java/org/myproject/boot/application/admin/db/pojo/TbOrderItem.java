package org.myproject.boot.application.admin.db.pojo;

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
    private static final long serialVersionUID = 1L;
    private Long orderId;
    private Integer orderNo;
    private Long goodsId;
    private String goodsCode;
    private String goodsName;
    private BigDecimal goodsSinglePrice;
    private Integer goodsNum;
    private BigDecimal goodsTotalPrice;
}