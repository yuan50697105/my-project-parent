package org.myproject.boot.application.goods.db.pojo;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 商品类型
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "tb_goods_type")
public class TbGoodsType extends BaseEntity {
    /**
     * 类型名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 类型描述
     */
    @Column(name = "description")
    private String description;
}