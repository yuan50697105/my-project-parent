package org.myproject.boot.application.admin.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 路由表
    */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbSysRoute extends BaseEntity {
    private String url;

    private String name;

    private Long parentId;

    private Integer weight;
}