package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbGoodsInfoQuery extends BaseEntity implements Serializable, MybatisExample<TbGoodsInfoExample> {
    private static final long serialVersionUID = 1L;
    @AndLike
    private Long code;
    @AndLike
    private String name;
    @AndGreaterThanOrEqualTo(property = "price")
    private BigDecimal priceStart;
    @AndGreaterThanOrEqualTo(property = "price")
    private BigDecimal priceEnd;
}