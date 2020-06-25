package org.myproject.application.admin.db.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.mybatis.pagehelper.pojo.BaseEntity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SysUser extends BaseEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;
}