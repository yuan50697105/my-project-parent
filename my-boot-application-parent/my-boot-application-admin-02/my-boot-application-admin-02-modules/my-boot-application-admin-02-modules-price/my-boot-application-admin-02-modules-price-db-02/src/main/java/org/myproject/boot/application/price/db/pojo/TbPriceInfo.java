package org.myproject.boot.application.price.db.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 定价信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbPriceInfo extends BaseEntity {
    private Date createTime;

    private Date updateTime;

    private String creater;

    private String modifier;

    private Integer version;

    private Integer isDelete;

    private String name;

    private Long code;

    /**
     * 定价
     */
    private BigDecimal price;
}