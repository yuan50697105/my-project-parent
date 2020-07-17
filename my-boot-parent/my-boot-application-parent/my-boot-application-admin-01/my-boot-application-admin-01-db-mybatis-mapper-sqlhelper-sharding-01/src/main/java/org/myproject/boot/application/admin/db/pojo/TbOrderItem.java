package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 订单项目
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_order_item")
public class TbOrderItem extends BaseEntity implements Serializable {
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_no")
    private Integer orderNo;

    @Column(name = "goods_id")
    private Long goodsId;

    @Column(name = "goods_code")
    private String goodsCode;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_single_price")
    private BigDecimal goodsSinglePrice;

    @Column(name = "goods_num")
    private Integer goodsNum;

    @Column(name = "goods_total_price")
    private BigDecimal goodsTotalPrice;

    private static final long serialVersionUID = 1L;
}