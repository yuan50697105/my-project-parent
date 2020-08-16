package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName(value = "tb_order_item")
public class TbOrderItem extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ORDER_ID = "order_id";
    public static final String COL_ORDER_NO = "order_no";
    public static final String COL_GOODS_ID = "goods_id";
    public static final String COL_GOODS_CODE = "goods_code";
    public static final String COL_GOODS_NAME = "goods_name";
    public static final String COL_GOODS_SINGLE_PRICE = "goods_single_price";
    public static final String COL_GOODS_NUM = "goods_num";
    public static final String COL_GOODS_TOTAL_PRICE = "goods_total_price";
    private static final long serialVersionUID = 1L;
    @TableField(value = "order_id")
    private Long orderId;
    @TableField(value = "order_no")
    private Integer orderNo;
    @TableField(value = "goods_id")
    private Long goodsId;
    @TableField(value = "goods_code")
    private String goodsCode;
    @TableField(value = "goods_name")
    private String goodsName;
    @TableField(value = "goods_single_price")
    private BigDecimal goodsSinglePrice;
    @TableField(value = "goods_num")
    private Integer goodsNum;
    @TableField(value = "goods_total_price")
    private BigDecimal goodsTotalPrice;
}