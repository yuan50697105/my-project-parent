package org.myproject.cloud.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 角色路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysRoleRoute extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_ROUTE_ID = "route_id";
    private static final long serialVersionUID = 1L;
    private Long roleId;
    private Long routeId;
}