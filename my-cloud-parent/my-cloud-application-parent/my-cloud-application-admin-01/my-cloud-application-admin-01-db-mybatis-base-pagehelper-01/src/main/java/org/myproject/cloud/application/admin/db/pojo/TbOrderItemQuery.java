package org.myproject.cloud.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
    * 订单项目
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbOrderItemQuery extends BaseEntity implements Serializable, MybatisExample<TbOrderInfoExample> {
    @AndEqualTo
    private Long orderId;

    @AndLike
    private Integer orderNo;

    @AndEqualTo
    private Long goodsId;

    @AndLike
    private String goodsCode;

    @AndLike
    private String goodsName;

    private BigDecimal goodsSinglePrice;

    private Integer goodsNum;

    private BigDecimal goodsTotalPrice;

    private static final long serialVersionUID = 1L;
}