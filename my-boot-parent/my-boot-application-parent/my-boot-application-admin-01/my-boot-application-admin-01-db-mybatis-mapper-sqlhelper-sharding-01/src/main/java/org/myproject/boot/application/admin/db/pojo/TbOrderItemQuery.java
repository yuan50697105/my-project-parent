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
 * 订单项目
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_order_item")
public class TbOrderItemQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbOrderItem, Example> {
    private static final long serialVersionUID = 1L;
    @Column(name = "order_id")
    @AndEqualTo
    private Long orderId;
    @Column(name = "order_no")
    @AndLike
    private Integer orderNo;
    @Column(name = "goods_id")
    @AndEqualTo
    private Long goodsId;
    @Column(name = "goods_code")
    @AndLike
    private String goodsCode;
    @Column(name = "goods_name")
    @AndLike
    private String goodsName;
    @Column(name = "goods_single_price")
    private BigDecimal goodsSinglePrice;
    @Column(name = "goods_num")
    private Integer goodsNum;
    @Column(name = "goods_total_price")
    private BigDecimal goodsTotalPrice;
}