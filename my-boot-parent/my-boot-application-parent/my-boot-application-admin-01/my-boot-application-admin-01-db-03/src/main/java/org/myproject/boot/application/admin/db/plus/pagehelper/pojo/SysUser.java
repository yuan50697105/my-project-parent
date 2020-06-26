package org.myproject.boot.application.admin.db.plus.pagehelper.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.mybatisplus.pagehelper.pojo.BaseEntity;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_NAME = "name";

    public static final String COL_PASSWORD = "password";

    public static final String COL_ENABLED = "enabled";
}