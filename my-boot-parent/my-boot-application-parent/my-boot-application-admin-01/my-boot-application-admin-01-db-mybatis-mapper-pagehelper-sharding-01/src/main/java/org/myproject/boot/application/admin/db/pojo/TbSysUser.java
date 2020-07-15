package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user")
public class TbSysUser extends BaseEntity implements Serializable {
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
    private String username;
    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;
    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;
    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;
}