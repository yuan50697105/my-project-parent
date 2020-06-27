package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
    * sys_role
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleQuery extends BaseEntity implements Serializable, MybatisExampleForTk<SysRole, Example> {
    /**
     * 角色名称
     */
    @AndLike
    @TableField(value = "name")
    private String name;

    /**
     * 角色描述
     */
    @AndLike
    @TableField(value = "description")
    private String description;

    /**
     * 启用状态
     */
    @TableField(value = "enabled")
    @AndEqualTo
    private String enabled;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_ENABLED = "enabled";
}