package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_role")
public class TbSysRole extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ENABLED = "enabled";
    private static final long serialVersionUID = 1L;
    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;
    /**
     * 角色描述
     */
    @Column(name = "description")
    private String description;
    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;
}