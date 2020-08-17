package org.myproject.boot.application.price.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import io.swagger.annotations.Example;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 定价信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_price_info")
public class TbPriceInfoQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbPriceInfo, Example> {
    private static final long serialVersionUID = 1L;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    @Column(name = "`name`")
    private String name;
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    @Column(name = "code")
    private Long code;
}