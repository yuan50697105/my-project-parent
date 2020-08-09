package org.myproject.boot.application.admin.db.pojo;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 角色
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "tb_sys_role")
public class TbSysRole extends BaseEntity {
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

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;
}