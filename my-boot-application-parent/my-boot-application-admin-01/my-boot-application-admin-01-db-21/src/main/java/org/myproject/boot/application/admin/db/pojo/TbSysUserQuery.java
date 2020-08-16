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
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user")
public class TbSysUserQuery extends BaseEntity implements Serializable, MybatisExampleForTk<TbSysUser, Example> {
    public static final String COL_ID = "id";
    public static final String COL_USERNAME = "username";
    public static final String COL_NAME = "name";
    public static final String COL_PASSWORD = "password";
    public static final String COL_ENABLED = "enabled";
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @Column(name = "username")
    @AndLike
    private String username;
    /**
     * 姓名
     */
    @Column(name = "`name`")
    @AndLike
    private String name;
    /**
     * 启用状态
     */
    @Column(name = "enabled")
    @AndEqualTo
    private String enabled;
}