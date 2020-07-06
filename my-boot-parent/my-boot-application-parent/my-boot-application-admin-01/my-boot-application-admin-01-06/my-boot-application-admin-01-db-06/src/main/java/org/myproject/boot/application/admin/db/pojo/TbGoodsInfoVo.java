package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_goods_info")
public class TbGoodsInfoVo extends BaseEntity implements Serializable {
    @Column(name = "code")
    private Long code;

    @Column(name = "`name`")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "type_id")
    private Long typeId;

    private static final long serialVersionUID = 1L;
}