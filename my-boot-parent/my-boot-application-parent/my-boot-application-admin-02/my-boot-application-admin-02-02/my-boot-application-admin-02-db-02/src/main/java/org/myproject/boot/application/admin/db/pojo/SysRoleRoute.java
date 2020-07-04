package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 角色路由表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleRoute extends BaseEntity implements Serializable {
    private Long roleId;

    private Long routeId;

    private static final long serialVersionUID = 1L;
}