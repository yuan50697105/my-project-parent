package org.myproject.cloud.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class TbGoodsType extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    private String name;

    private static final long serialVersionUID = 1L;
}