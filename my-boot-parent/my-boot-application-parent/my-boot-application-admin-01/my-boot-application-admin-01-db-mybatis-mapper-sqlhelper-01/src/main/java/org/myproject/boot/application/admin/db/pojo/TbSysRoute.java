package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_route")
public class TbSysRoute extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_URL = "url";
    public static final String COL_NAME = "name";
    public static final String COL_PARENT_ID = "parent_id";
    public static final String COL_WEIGHT = "weight";
    private static final long serialVersionUID = 1L;
    @Column(name = "url")
    private String url;
    @Column(name = "`name`")
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "weight")
    private Integer weight;
}