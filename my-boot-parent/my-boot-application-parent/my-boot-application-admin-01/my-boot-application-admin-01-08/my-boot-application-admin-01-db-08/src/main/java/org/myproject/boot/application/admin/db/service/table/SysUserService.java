package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;

import java.util.List;

public interface SysUserService extends IService<SysUser>{


    PageInfo<SysUser> selectByQuery(SysUserQuery query, int page, int size);

    List<SysUser> selectByQuery(SysUserQuery query);
}
