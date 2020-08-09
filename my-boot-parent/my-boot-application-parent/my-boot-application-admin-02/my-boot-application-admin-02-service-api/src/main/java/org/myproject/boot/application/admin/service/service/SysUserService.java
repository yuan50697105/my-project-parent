package org.myproject.boot.application.admin.service.service;

import org.myproject.boot.application.admin.service.pojo.SysUserAoDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserQueryDTO;
import org.myproject.boot.application.admin.service.pojo.SysUserVoDTO;
import org.myproject.boot.application.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-08-04 12:40
 */
public interface SysUserService {
    SysUserAoDTO get(Long id);

    List<Object> get(Long userId, Long roleId);

    List<SysUserAoDTO> list(SysUserQueryDTO queryDTO);

    IPage<SysUserAoDTO> list(SysUserQueryDTO queryDTO, int page, int limit);

    void save(SysUserVoDTO sysUsers);

    void delete(Long id);
}