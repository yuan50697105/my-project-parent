package java.org.myproject.boot.application.admin.db.pojo;

import lombok.*;
import org.myproject.boot.mybatis.pojo.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * sys_role
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleVo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
    /**
     * 路由ID列表
     */
    private List<Long> routeIds;
}