package org.myproject.boot.application.price.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
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
public class TbPriceInfoQuery extends BaseEntity implements MybatisExample<TbPriceInfoExample> {
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;

    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private Long code;

}