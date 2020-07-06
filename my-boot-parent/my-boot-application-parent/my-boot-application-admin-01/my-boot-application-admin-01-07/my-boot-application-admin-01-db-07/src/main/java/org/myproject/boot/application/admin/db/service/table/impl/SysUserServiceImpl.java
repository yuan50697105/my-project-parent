package org.myproject.boot.application.admin.db.service.table.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.pojo.SysUserQuery;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.myproject.boot.application.admin.db.mapper.SysUserMapper;
import org.myproject.boot.application.admin.db.pojo.SysUser;
import org.myproject.boot.application.admin.db.service.table.SysUserService;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

    @Override
    public PageInfo<SysUser> selectByQuery(SysUserQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(baseMapper.selectByExample(query.toExample()));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
