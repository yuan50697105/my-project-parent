package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 订单类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_order_info")
public class TbOrderInfo extends BaseEntity implements Serializable {
    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private Integer customerName;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}