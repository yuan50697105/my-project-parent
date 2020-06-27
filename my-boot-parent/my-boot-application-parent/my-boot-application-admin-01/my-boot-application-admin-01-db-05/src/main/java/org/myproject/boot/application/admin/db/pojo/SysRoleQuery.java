package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_role")
public class SysRoleQuery extends BaseEntity implements Serializable, MybatisExampleForTk<SysRole, Example> {
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

    private static final long serialVersionUID = 1L;
}