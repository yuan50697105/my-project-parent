package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

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
    private static final long serialVersionUID = 1L;
    private String url;
    private String name;
    private Long parentId;
    private Integer weight;
}