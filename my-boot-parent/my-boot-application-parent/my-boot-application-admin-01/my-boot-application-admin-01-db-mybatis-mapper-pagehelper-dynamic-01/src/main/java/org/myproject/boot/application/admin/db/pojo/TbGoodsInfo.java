package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_goods_info")
public class TbGoodsInfo extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_CODE = "code";
    public static final String COL_NAME = "name";
    public static final String COL_PRICE = "price";
    public static final String COL_TYPE_ID = "type_id";
    private static final long serialVersionUID = 1L;
    @Column(name = "code")
    private Long code;
    @Column(name = "`name`")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "type_id")
    private Long typeId;
}