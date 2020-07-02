package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 23:45
 */
@Mapper
public interface SysUserRouteMapper {
    List<String> selectByUserId(Long userId);
}
