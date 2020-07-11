package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUser extends BaseEntity {
    /**
     * 用户名
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 启用状态
     */
    private String enabled;
}