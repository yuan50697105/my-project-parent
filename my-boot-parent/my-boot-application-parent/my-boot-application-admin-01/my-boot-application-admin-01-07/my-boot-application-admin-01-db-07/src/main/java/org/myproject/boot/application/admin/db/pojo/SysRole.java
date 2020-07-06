package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_role")
public class SysRole extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 角色名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 角色描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 启用状态
     */
    @TableField(value = "enabled")
    private String enabled;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_ENABLED = "enabled";
}