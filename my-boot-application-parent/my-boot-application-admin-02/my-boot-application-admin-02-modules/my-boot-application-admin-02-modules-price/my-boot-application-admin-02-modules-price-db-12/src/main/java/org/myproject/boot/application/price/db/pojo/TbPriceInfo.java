package org.myproject.boot.application.price.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 定价信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_price_info")
public class TbPriceInfo extends BaseEntity implements Serializable, MybatisExampleForTk<TbPriceInfo,Exception> {
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    @Column(name = "`name`")
    private String name;

    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    @Column(name = "code")
    private Long code;

    /**
     * 定价
     */
    @Column(name = "price")
    private BigDecimal price;

    private static final long serialVersionUID = 1L;
}