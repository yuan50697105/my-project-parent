package org.myproject.boot.application.admin.service.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 12:40
 */
@Data
public class SysUserAoDTO {
    private Long id;
    private String username;
    private String name;
    private List<SysRoleAoDTO> roles;
}