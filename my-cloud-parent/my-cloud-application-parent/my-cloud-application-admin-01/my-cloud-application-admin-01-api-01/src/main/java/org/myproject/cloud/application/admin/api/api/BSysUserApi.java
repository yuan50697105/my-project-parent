package org.myproject.cloud.application.admin.api.api;


import org.myproject.cloud.application.admin.api.pojo.BSysUser;
import org.myproject.cloud.application.admin.api.pojo.BSysUserQuery;
import org.myproject.cloud.application.admin.api.pojo.BSysUserVo;
import org.myproject.cloud.application.admin.api.pojo.IPage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-04 23:17
 */
@RequestMapping("sys/user")

public interface BSysUserApi {
    @PostMapping(value = "data")

    IPage<BSysUser> selectPageByQuery(@RequestBody BSysUserQuery query);

    @PostMapping(value = "list")
    
    List<BSysUser> selectListByQuery(@RequestBody BSysUserQuery query);

    @PostMapping("get")
    
    BSysUser get(@RequestBody Long id);

    @PostMapping("save")
    
    void save(@RequestBody BSysUserVo sysUser);

    @PostMapping("update")
    
    void update(@RequestBody BSysUserVo sysUser);

    @PostMapping("deleteOne")
    
    void delete(@RequestBody Long id);

    @PostMapping("deleleList")
    
    void delete(@RequestBody List<Long> ids);

    @PostMapping("modify")
    
    void modify(@RequestBody BSysUserVo BSysUserVo);
}
