package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper=true)
public class TbGoodsInfo extends BaseEntity {
    private Long code;

    private String name;

    private BigDecimal price;

    private Long typeId;
}