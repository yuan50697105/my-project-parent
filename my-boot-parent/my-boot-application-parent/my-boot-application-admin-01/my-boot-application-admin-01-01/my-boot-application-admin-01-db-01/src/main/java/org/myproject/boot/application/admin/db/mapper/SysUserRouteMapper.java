package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-30 18:17
 */
@Mapper
public interface SysUserRouteMapper {
    List<String> selectRouteUrlByUserId(Long userId);
}
