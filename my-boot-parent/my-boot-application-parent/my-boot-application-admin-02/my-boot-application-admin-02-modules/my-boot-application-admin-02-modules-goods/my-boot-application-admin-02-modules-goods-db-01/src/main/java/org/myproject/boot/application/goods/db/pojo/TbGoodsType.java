package org.myproject.boot.application.goods.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 商品类型
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbGoodsType extends BaseEntity {
    /**
    * 类型名称
    */
    private String name;

    /**
    * 类型描述
    */
    private String description;
}