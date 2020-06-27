package org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;

/**
    * sys_role
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRole extends BaseEntity implements Serializable {
    /**
    * 角色名称
    */
    private String name;

    /**
    * 角色描述
    */
    private String description;

    /**
    * 启用状态
    */
    private String enabled;

    private static final long serialVersionUID = 1L;
}