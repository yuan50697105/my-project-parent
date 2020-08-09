package org.myproject.boot.application.admin.web.db.service.impl;

import org.myproject.boot.application.admin.web.db.mapper.TbSysPermissionMapper;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermissionExample;
import org.myproject.boot.application.admin.web.db.service.TbSysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSysPermissionServiceImpl implements TbSysPermissionService {

    @Resource
    private TbSysPermissionMapper tbSysPermissionMapper;

    @Override
    public long countByExample(TbSysPermissionExample example) {
        return tbSysPermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbSysPermissionExample example) {
        return tbSysPermissionMapper.deleteByExample(example);
    }

    @Override
    public int insert(TbSysPermission record) {
        return tbSysPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(TbSysPermission record) {
        return tbSysPermissionMapper.insertSelective(record);
    }

    @Override
    public List<TbSysPermission> selectByExample(TbSysPermissionExample example) {
        return tbSysPermissionMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbSysPermission record, TbSysPermissionExample example) {
        return tbSysPermissionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TbSysPermission record, TbSysPermissionExample example) {
        return tbSysPermissionMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<TbSysPermission> list) {
        return tbSysPermissionMapper.batchInsert(list);
    }

    @Override
    public int deleteByRoleId(Long roleId) {
        TbSysPermissionExample example = new TbSysPermissionExample();
        example.or().andRoleIdEqualTo(roleId);
        return deleteByExample(example);
    }

}

