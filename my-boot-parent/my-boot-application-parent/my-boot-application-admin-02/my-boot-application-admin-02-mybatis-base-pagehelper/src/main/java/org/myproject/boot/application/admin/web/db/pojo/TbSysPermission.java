package org.myproject.boot.application.admin.web.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysPermission extends BaseEntity implements Serializable {
    private Date createTime;

    private Date updateTime;

    private String creater;

    private String modifier;

    private Integer version;

    private Integer isDelete;

    private String name;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}