package org.myproject.boot.application.admin.web.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TbSysUser extends BaseEntity implements Serializable {
    private Date createTime;

    private Date updateTime;

    private String creater;

    private String modifier;

    private Integer version;

    private Integer isDelete;

    private String username;

    private String name;

    private String password;

    private static final long serialVersionUID = 1L;
}