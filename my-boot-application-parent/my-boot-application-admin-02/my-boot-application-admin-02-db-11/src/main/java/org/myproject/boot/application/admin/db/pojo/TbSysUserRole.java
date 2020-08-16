package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 系统用户
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "tb_sys_user_role")
public class TbSysUserRole extends BaseEntity {
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "creater")
    private String creater;

    @Column(name = "modifier")
    private String modifier;

    @Column(name = "version")
    private Integer version;

    @Column(name = "is_delete")
    private Integer isDelete;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "role_id")
    private Long roleId;
}