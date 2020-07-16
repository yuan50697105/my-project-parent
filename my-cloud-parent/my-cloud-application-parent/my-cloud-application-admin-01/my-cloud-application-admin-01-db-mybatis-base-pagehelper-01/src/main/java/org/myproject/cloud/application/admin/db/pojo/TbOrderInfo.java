package org.myproject.cloud.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbOrderInfo extends BaseEntity implements Serializable {
    private String orderNo;

    private Long customerId;

    private Integer customerName;

    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}