package org.myproject.boot.application.goods.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 商品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbGoodsInfo extends BaseEntity {
    private String name;

    private String description;
}