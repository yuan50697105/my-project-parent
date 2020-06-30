package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 角色路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_role_route")
public class SysRoleRoute extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "route_id")
    private Long routeId;
}