package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * sys_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends BaseEntity implements Serializable {
    /**
    * 用户名
    */
    private String username;

    /**
    * 姓名
    */
    private String name;

    /**
    * 密码
    */
    private String password;

    /**
    * 启用状态
    */
    private String enabled;

    private static final long serialVersionUID = 1L;
}