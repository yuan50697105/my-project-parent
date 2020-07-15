package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import com.gitee.denger.mybatis.example.ext.annotation.AndNotLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 订单类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_order_info")
public class TbOrderInfo extends BaseEntity implements Serializable, MybatisExample<TbOrderInfoExample> {
    private static final long serialVersionUID = 1L;
    @Column(name = "order_no")
    @AndNotLike
    private String orderNo;
    @Column(name = "customer_id")
    @AndEqualTo
    private Long customerId;
    @Column(name = "customer_name")
    @AndLike
    private Integer customerName;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
}