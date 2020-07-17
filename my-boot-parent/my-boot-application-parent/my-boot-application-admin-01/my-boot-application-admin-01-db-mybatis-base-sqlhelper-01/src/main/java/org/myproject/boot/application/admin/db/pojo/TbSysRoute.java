package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRoute extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_NAME = "name";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_WEIGHT = "weight";
    private String url;

    private String name;

    private Long parentId;

    private Integer weight;

    private static final long serialVersionUID = 1L;
}