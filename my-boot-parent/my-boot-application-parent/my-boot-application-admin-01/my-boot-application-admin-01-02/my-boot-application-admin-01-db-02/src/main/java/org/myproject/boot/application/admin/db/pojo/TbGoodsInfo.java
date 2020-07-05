package org.myproject.boot.application.admin.db.pojo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbGoodsInfo extends BaseEntity {
    private Long code;

    private String name;

    private BigDecimal price;

    private Long typeId;
}