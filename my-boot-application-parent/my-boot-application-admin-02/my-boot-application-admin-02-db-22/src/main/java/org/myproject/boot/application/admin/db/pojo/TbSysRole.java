package org.myproject.boot.application.admin.db.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.util.Date;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "tb_sys_role")
public class TbSysRole extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_TIME = "update_time";
    public static final String COL_CREATER = "creater";
    public static final String COL_MODIFIER = "modifier";
    public static final String COL_VERSION = "version";
    public static final String COL_IS_DELETE = "is_delete";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
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
    @TableField(value = "`name`")
    private String name;
    @TableField(value = "description")
    private String description;
}