package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.*;
import org.myproject.boot.mybatis.pagehelper.pojo.BaseEntity;

import java.io.Serializable;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleQuery extends BaseEntity implements Serializable, MybatisExample<SysRoleExample> {
    private static final long serialVersionUID = 1L;
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