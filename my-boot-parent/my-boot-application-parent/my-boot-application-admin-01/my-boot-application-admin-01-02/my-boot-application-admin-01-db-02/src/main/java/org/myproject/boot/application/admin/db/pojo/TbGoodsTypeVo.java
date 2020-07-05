package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbGoodsTypeVo extends BaseEntity {
    private String name;
}