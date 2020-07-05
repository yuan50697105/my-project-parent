package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbGoodsInfoVo extends BaseEntity {
    private Long code;

    private String name;

    private BigDecimal price;

    private Long typeId;
}