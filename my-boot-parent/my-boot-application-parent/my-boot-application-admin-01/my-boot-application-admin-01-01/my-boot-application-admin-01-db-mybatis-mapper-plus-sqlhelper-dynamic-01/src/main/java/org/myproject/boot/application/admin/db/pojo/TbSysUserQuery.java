package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_sys_user")
public class TbSysUserQuery extends BaseEntity implements Serializable, MybatisExample<TbSysUserExample> {
    public static final String COL_ID = "id";
    public static final String COL_USERNAME = "username";
    public static final String COL_NAME = "name";
    public static final String COL_PASSWORD = "password";
    public static final String COL_ENABLED = "enabled";
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    @TableField(value = "username")
    @AndLike
    private String username;
    /**
     * 姓名
     */
    @TableField(value = "name")
    @AndLike
    private String name;
    /**
     * 启用状态
     */
    @TableField(value = "enabled")
    @AndEqualTo
    private String enabled;
}