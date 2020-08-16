package org.myproject.boot.application.goods.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 商品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbGoodsInfoQuery extends BaseEntity implements MybatisExample<TbGoodsInfoExample> {
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;
}