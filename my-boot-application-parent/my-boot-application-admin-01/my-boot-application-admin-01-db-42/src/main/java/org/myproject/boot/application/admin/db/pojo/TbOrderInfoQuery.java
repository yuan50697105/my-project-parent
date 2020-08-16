package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName(value = "tb_order_info")
public class TbOrderInfoQuery extends BaseEntity implements Serializable, MybatisExample<TbOrderInfoExample> {
    public static final String COL_ID = "id";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_NAME = "customer_name";
    public static final String COL_TOTAL_PRICE = "total_price";
    private static final long serialVersionUID = 1L;
    @TableField(value = "order_no")
    @AndLike
    private String orderNo;
    @TableField(value = "customer_id")
    @AndEqualTo
    private Long customerId;
    @TableField(value = "customer_name")
    @AndLike
    private Integer customerName;
    @TableField(value = "total_price")
    private BigDecimal totalPrice;
}