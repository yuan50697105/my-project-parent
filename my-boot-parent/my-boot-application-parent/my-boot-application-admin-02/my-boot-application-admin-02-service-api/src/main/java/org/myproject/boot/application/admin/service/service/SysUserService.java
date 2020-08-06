package org.myproject.boot.application.admin.service.service;

import org.myproject.boot.application.admin.service.pojo.SysUserAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserQueryDTO;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 12:40
 */
public interface SysUserService {
    SysUserAoDTO get(Long id);

    List<SysUserAoDTO> list(SysUserQueryDTO queryDTO);


}