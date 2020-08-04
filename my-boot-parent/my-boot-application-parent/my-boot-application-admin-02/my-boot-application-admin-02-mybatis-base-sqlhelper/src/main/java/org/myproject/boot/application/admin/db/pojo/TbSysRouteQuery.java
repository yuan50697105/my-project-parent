package org.myproject.boot.application.admin.db.pojo;

import com.gitee.denger.mybatis.example.ext.MybatisExample;
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
public class TbSysRouteQuery extends BaseEntity implements Serializable, MybatisExample<TbSysRouteExample> {
    private Date createTime;

    private Date updateTime;

    private String creater;

    private String modifier;

    private Integer version;

    private Integer isDelete;

    private String name;

    private String url;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}