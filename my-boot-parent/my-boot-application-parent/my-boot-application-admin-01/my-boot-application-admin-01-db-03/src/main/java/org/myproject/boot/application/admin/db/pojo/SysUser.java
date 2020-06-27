package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.myproject.boot.mybatisplus.base.pagehelper.pojo.BaseEntity;

import java.io.Serializable;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser extends BaseEntity implements Serializable {
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
    private String username;
    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;
    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;
    /**
     * 启用状态
     */
    @TableField(value = "enabled")
    private String enabled;
}