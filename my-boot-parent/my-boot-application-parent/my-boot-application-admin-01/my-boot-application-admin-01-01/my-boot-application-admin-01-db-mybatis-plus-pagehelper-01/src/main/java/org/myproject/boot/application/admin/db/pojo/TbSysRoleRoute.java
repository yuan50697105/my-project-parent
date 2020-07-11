package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 角色路由表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_sys_role_route")
public class TbSysRoleRoute extends BaseEntity implements Serializable {
    @TableField(value = "role_id")
    private Long roleId;

    @TableField(value = "route_id")
    private Long routeId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_ROUTE_ID = "route_id";
}