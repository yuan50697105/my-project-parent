package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_goods_type")
public class TbGoodsType extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    @Column(name = "`name`")
    private String name;

    private static final long serialVersionUID = 1L;
}