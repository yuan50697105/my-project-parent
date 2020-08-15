package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_order_info")
public class TbOrderInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbOrderInfo, Example> {
    private static final long serialVersionUID = 1L;
    @Column(name = "order_no")
    @AndLike
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