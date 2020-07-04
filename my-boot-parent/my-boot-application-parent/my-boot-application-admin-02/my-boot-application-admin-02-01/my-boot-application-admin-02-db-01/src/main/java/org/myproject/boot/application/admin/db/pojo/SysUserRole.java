package org.myproject.boot.application.admin.db.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.myproject.boot.mybatis.pojo.BaseEntity;

/**
    * 用户角色
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole extends BaseEntity implements Serializable {
    private Long userId;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}