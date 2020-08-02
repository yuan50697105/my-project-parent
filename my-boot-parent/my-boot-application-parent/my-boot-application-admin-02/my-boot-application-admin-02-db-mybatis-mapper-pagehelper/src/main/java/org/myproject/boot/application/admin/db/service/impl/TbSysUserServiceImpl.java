package org.myproject.boot.application.admin.db.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.boot.application.admin.db.mapper.TbSysUserMapper;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
import org.myproject.boot.application.admin.db.pojo.TbSysUserQuery;
import org.myproject.boot.application.admin.db.service.TbSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysUserServiceImpl implements TbSysUserService {

    @Resource
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public int insert(TbSysUser record) {
        return tbSysUserMapper.insert(record);
    }

    @Override
    public TbSysUser selectByPrimaryKey(Long id) {
        return tbSysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbSysUser tbSysUser) {
        return tbSysUserMapper.updateByPrimaryKeySelective(tbSysUser);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbSysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<TbSysUser> selectByQuery(TbSysUserQuery tbQuery, int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(tbSysUserMapper.selectByExample(tbQuery.toExample()));
    }

    @Override
    public List<TbSysUser> selectByQuery(TbSysUserQuery sysUserQuery) {
        return null;
    }
}
