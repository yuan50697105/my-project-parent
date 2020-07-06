package org.myproject.boot.application.admin.db.service.table;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
import org.myproject.boot.application.admin.db.pojo.SysRoleQuery;

import java.util.List;

public interface SysRoleService extends IService<SysRole>{


    PageInfo<SysRole> selectByQuery(SysRoleQuery query, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);
}
