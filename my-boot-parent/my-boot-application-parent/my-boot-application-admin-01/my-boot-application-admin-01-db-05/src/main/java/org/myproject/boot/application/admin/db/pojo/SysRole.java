package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_role")
public class SysRole extends BaseEntity implements Serializable {
    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 角色描述
     */
    @Column(name = "description")
    private String description;

    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;
}