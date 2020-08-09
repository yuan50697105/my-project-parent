package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 系统用户
    */
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "tb_sys_user_role")
public class TbSysUserRole extends BaseEntity {
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "update_time")
    private Date updateTime;

    @TableField(value = "creater")
    private String creater;

    @TableField(value = "modifier")
    private String modifier;

    @TableField(value = "version")
    private Integer version;

    @TableField(value = "is_delete")
    private Integer isDelete;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "role_id")
    private Long roleId;

    public static final String COL_ID = "id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_CREATER = "creater";

    public static final String COL_MODIFIER = "modifier";

    public static final String COL_VERSION = "version";

    public static final String COL_IS_DELETE = "is_delete";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_ROLE_ID = "role_id";
}