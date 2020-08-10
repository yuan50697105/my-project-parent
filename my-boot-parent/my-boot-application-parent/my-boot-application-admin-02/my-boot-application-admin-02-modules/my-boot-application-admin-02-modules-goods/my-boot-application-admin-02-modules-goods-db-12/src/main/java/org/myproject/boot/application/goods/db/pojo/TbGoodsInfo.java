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
@Table(name = "tb_goods_info")
public class TbGoodsInfo extends BaseEntity {
    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;
}