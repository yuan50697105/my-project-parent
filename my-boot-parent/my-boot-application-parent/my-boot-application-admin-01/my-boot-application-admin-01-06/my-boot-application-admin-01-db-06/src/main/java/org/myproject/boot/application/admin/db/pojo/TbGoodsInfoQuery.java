package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_goods_info")
public class TbGoodsInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbGoodsInfo, Example> {
    @Column(name = "code")
    @AndLike
    private Long code;

    @Column(name = "`name`")
    @AndLike
    private String name;

    @Column(name = "price")
    @AndGreaterThanOrEqualTo(property = "price")
    private BigDecimal priceStart;
    @AndLessThanOrEqualTo(property = "price")
    private BigDecimal priceEnd;

    @Column(name = "type_id")
    @AndEqualTo
    private Long typeId;

    private static final long serialVersionUID = 1L;
}