package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_goods_type")
public class TbGoodsTypeVo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Column(name = "`name`")
    private String name;
}