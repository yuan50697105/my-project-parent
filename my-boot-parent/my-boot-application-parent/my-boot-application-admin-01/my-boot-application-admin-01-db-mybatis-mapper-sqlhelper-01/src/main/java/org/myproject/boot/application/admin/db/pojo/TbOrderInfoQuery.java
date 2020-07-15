package org.myproject.boot.application.admin.db.pojo;

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
public class TbOrderInfoQuery extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderNo;
    private Long customerId;
    private Integer customerName;
    private BigDecimal totalPrice;
}