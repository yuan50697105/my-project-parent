package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 用户角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUserRole extends BaseEntity {
    private Long userId;

    private Long roleId;
}