package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

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