package org.myproject.app.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.auth.mapper.AuthPermissionMapper;
import org.myproject.app.auth.pojo.*;
import org.myproject.app.auth.service.AuthPermissionService;
import org.myproject.app.auth.service.AuthPojoConverter;
import org.myproject.app.commons.pojo.IPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class AuthPermissionServiceImpl implements AuthPermissionService {

    @Resource
    private AuthPermissionMapper authPermissionMapper;
    @Resource
    private AuthPojoConverter converter;

    @Override
    public long countByExample(AuthPermissionExample example) {
        return authPermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthPermissionExample example) {
        return authPermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AuthPermission record) {
        return authPermissionMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(AuthPermission record) {
        return authPermissionMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(AuthPermission record) {
        return authPermissionMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(AuthPermission record) {
        return authPermissionMapper.insertSelective(record);
    }

    @Override
    public List<AuthPermission> selectByExample(AuthPermissionExample example) {
        return authPermissionMapper.selectByExample(example);
    }

    @Override
    public AuthPermission selectByPrimaryKey(Long id) {
        return authPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AuthPermission record, AuthPermissionExample example) {
        return authPermissionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(AuthPermission record, AuthPermissionExample example) {
        return authPermissionMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(AuthPermission record) {
        return authPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(AuthPermissionVo authPermissionVo) {
        return insert(converter.convert(authPermissionVo));
    }

    @Override
    public IPage<AuthPermission> selectPageByQuery(AuthPermissionQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public int updateByPrimaryKeySelective(AuthPermissionVo authPermissionVo) {
        return updateByPrimaryKeySelective(converter.convert(authPermissionVo));
    }

    @Override
    public int updateByPrimaryKey(AuthPermission record) {
        return authPermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public AuthPermission selectOneByCode(String code) {
        return authPermissionMapper.selectOneByCode(code);
    }

    @Override
    public List<AuthPermission> selectAllByCodeContaining(String containingCode) {
        return authPermissionMapper.selectAllByCodeContaining(containingCode);
    }

    @Override
    public List<AuthPermission> selectAllByCodeLike(String likeCode) {
        return authPermissionMapper.selectAllByCodeLike(likeCode);
    }

    @Override
    public List<AuthPermission> selectAllByIdIn(Collection<Long> idCollection) {
        return authPermissionMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public int updateBatch(List<AuthPermission> list) {
        return authPermissionMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<AuthPermission> list) {
        return authPermissionMapper.batchInsert(list);
    }

    @Override
    public int deleteByIdIn(Collection<Long> idCollection) {
        return authPermissionMapper.deleteByIdIn(idCollection);
    }
}

