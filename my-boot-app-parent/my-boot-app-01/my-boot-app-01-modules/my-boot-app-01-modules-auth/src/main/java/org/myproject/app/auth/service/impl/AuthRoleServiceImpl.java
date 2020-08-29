package org.myproject.app.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.auth.mapper.AuthRoleMapper;
import org.myproject.app.auth.pojo.*;
import org.myproject.app.auth.service.AuthPojoConverter;
import org.myproject.app.auth.service.AuthRoleService;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class AuthRoleServiceImpl implements AuthRoleService {

    @Resource
    private AuthRoleMapper authRoleMapper;
    @Resource
    private AuthPojoConverter converter;

    @Override
    public long countByExample(AuthRoleExample example) {
        return authRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthRoleExample example) {
        return authRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AuthRole record) {
        return authRoleMapper.insert(record);
    }

    @Override
    public int insert(AuthRoleVo authRoleVo) {
        return insert(converter.convert(authRoleVo));
    }

    @Override
    public int insertOrUpdate(AuthRole record) {
        return authRoleMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AuthRole record) {
        return authRoleMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AuthRole record) {
        return authRoleMapper.insertSelective(record);
    }

    @Override
    public List<AuthRole> selectByExample(AuthRoleExample example) {
        return authRoleMapper.selectByExample(example);
    }

    @Override
    public AuthRole selectByPrimaryKey(Long id) {
        return authRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AuthRole record, AuthRoleExample example) {
        return authRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AuthRole record, AuthRoleExample example) {
        return authRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthRole record) {
        return authRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthRoleVo authRoleVo) {
        return updateByPrimaryKeySelective(converter.convert(authRoleVo));
    }

    @Override
    public int updateByPrimaryKey(AuthRole record) {
        return authRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AuthRole> selectAllByIdIn(Collection<Long> idCollection) {
        return authRoleMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public List<AuthRole> selectAllByName(String name) {
        return authRoleMapper.selectAllByName(name);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return authRoleMapper.deleteByIdIn(idCollection);
    }

    @Override
    public int updateEnabledById(Integer updatedEnabled, Long id) {
        return authRoleMapper.updateEnabledById(updatedEnabled, id);
    }

    @Override
    public int updateEnabledByIdIn(Integer updatedEnabled, Collection<Long> idCollection) {
        return authRoleMapper.updateEnabledByIdIn(updatedEnabled, idCollection);
    }

    @Override
    public int updateBatch(List<AuthRole> list) {
        return authRoleMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AuthRole> list) {
        return authRoleMapper.batchInsert(list);
    }

    @Override
    public IPage<AuthRole> selectPageByQuery(AuthRoleQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public AuthRoleDetailResult selectDetailById(Long id) {
        return authRoleMapper.selectDetailById(id);
    }
}
