package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
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
public class TbOrderInfoQuery extends BaseEntity implements Serializable, MybatisExample<TbOrderInfoExample> {
    private static final long serialVersionUID = 1L;
    @AndLike
    private String orderNo;
    @AndEqualTo
    private Long customerId;
    @AndLike
    private Integer customerName;
    private BigDecimal totalPrice;
}