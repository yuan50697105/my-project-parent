package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 角色路由表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbSysRoleRoute extends BaseEntity {
    private Long roleId;

    private Long routeId;
}