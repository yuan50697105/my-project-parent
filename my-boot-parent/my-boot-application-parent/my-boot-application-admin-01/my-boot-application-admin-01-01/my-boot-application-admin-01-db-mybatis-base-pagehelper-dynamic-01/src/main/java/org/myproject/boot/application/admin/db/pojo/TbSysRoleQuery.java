package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRoleQuery extends BaseEntity implements MybatisExample<TbSysRoleExample> {
    /**
     * 角色名称
     */
    @AndLike
    private String name;

    /**
     * 角色描述
     */
    @AndLike
    private String description;

    /**
     * 启用状态
     */
    @AndEqualTo
    private String enabled;
}