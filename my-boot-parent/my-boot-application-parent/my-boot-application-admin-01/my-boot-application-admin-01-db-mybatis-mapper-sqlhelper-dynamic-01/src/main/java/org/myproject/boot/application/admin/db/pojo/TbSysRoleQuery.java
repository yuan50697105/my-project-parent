package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@Table(name = "tb_sys_role")
public class TbSysRoleQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbSysRole, Example> {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_ENABLED = "enabled";
    /**
     * 角色名称
     */
    @Column(name = "`name`")
    @AndLike
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
    @AndEqualTo
    private String enabled;

    private static final long serialVersionUID = 1L;
}