package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbGoodsInfoVo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long code;
    private String name;
    private BigDecimal price;
}