package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
 * 角色路由表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_sys_role_route")
public class TbSysRoleRoute extends BaseEntity implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ROLE_ID = "role_id";
    public static final String COL_ROUTE_ID = "route_id";
    private static final long serialVersionUID = 1L;
    @TableField(value = "role_id")
    private Long roleId;
    @TableField(value = "route_id")
    private Long routeId;
}