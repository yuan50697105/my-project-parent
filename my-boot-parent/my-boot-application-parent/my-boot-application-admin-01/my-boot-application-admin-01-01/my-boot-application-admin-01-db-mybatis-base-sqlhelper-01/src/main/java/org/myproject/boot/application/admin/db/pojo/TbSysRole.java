package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRole extends BaseEntity {
    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 启用状态
     */
    private String enabled;
}