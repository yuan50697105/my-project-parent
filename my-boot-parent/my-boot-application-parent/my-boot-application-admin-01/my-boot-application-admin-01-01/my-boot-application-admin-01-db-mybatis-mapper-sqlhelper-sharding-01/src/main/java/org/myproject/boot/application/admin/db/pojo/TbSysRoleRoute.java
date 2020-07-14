package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * 角色路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_role_route")
public class TbSysRoleRoute extends BaseEntity implements Serializable {
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "route_id")
    private Long routeId;

    private static final long serialVersionUID = 1L;
}