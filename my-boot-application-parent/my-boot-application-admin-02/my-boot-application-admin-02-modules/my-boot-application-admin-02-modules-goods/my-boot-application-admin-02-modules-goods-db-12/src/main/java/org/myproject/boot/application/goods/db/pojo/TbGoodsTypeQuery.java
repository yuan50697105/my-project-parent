package org.myproject.boot.application.goods.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.analytical.ExampleCriteriaValueImpl4Like;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * 商品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_goods_type")
public class TbGoodsTypeQuery extends BaseEntity implements MybatisExampleForTk<TbGoodsType, Example> {
    /**
     * 类型名称
     */
    @Column(name = "`name`")
    @AndLike(type = ExampleCriteriaValueImpl4Like.Type.suffix)
    private String name;

}