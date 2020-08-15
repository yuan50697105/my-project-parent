package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 用户角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUserRole extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_USER_ID = "user_id";
    public static final String COL_ROLE_ID = "role_id";
    private static final long serialVersionUID = 1L;
    private Long userId;
    private Long roleId;
}