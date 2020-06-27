package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.mapper.pagehelper.pojo.BaseEntity;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sys_user")
public class SysUser extends BaseEntity implements Serializable {
    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 启用状态
     */
    @Column(name = "enabled")
    private String enabled;

    private static final long serialVersionUID = 1L;
}