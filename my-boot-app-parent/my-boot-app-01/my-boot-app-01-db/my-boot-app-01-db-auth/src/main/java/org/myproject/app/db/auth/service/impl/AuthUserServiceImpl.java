package org.myproject.app.db.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.myproject.app.db.auth.mapper.AuthUserMapper;
import org.myproject.app.db.auth.mapper.AuthUserRoleMapper;
import org.myproject.app.db.auth.pojo.*;
import org.myproject.app.db.auth.service.AuthPojoConverter;
import org.myproject.app.db.auth.service.AuthUserService;
import org.myproject.app.db.commons.pojo.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
@CacheConfig(cacheNames = "users")
public class AuthUserServiceImpl implements AuthUserService {

    @Resource
    private AuthUserMapper authUserMapper;
    @Resource
    private AuthPojoConverter converter;
    @Autowired
    private AuthUserRoleMapper authUserRoleMapper;

    @Override
    public long countByExample(AuthUserExample example) {
        return authUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AuthUserExample example) {
        return authUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return authUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    @CachePut
    public int insert(AuthUser record) {
        return authUserMapper.insert(record);
    }

    @Override
    @CachePut
    public int insert(AuthUserVo record) {
        return authUserMapper.insert(converter.convert(record));
    }

    @Override
    @CachePut
    public int insertOrUpdate(AuthUser record) {
        return authUserMapper.insertOrUpdate(record);
    }

    @Override
    @CachePut
    public int insertOrUpdateSelective(AuthUser record) {
        return authUserMapper.insertOrUpdateSelective(record);
    }

    @Override
    @CachePut
    public int insertSelective(AuthUser record) {
        return authUserMapper.insertSelective(record);
    }

    @Override
    public List<AuthUser> selectByExample(AuthUserExample example) {
        return authUserMapper.selectByExample(example);
    }

    @Override
    @Cacheable
    public AuthUser selectByPrimaryKey(Long id) {
        return authUserMapper.selectByPrimaryKey(id);
    }

    @Override
    @CachePut
    public int updateByExampleSelective(AuthUser record, AuthUserExample example) {
        return authUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    @CachePut
    public int updateByExample(AuthUser record, AuthUserExample example) {
        return authUserMapper.updateByExample(record, example);
    }

    @Override
    @CachePut
    public int updateByPrimaryKeySelective(AuthUser record) {
        return authUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @CachePut
    public int updateByPrimaryKeySelective(AuthUserVo record) {
        return authUserMapper.updateByPrimaryKeySelective(converter.convert(record));
    }

    @Override
    @CachePut
    public int updateByPrimaryKey(AuthUser record) {
        return authUserMapper.updateByPrimaryKey(record);
    }

    @Override
    @Cacheable
    public AuthUser selectOneByUsername(String username) {
        return authUserMapper.selectOneByUsername(username);
    }

    @Override
    public List<AuthUser> selectAllByUsername(String username) {
        return authUserMapper.selectAllByUsername(username);
    }

    @Override
    public int updatePasswordByUsername(String updatedPassword, String username) {
        return authUserMapper.updatePasswordByUsername(updatedPassword, username);
    }

    @Override
    public int updatePasswordById(String updatedPassword, Long id) {
        return authUserMapper.updatePasswordById(updatedPassword, id);
    }

    @Override
    public int updateEnabledById(Integer updatedEnabled, Long id) {
        return authUserMapper.updateEnabledById(updatedEnabled, id);
    }

    @Override
    public int updateEnabledByIdIn(Integer updatedEnabled, Collection<Long> idCollection) {
        return authUserMapper.updateEnabledByIdIn(updatedEnabled, idCollection);
    }

    @Override
    public List<AuthUser> selectAllByIdIn(Collection<Long> idCollection) {
        return authUserMapper.selectAllByIdIn(idCollection);
    }

    @Override
    public int updateBatch(List<AuthUser> list) {
        return authUserMapper.updateBatch(list);
    }

    @Override
    @CachePut
    public int updateBatchSelective(List<AuthUser> list) {
        return authUserMapper.updateBatchSelective(list);
    }

    @Override
    @CachePut
    public int batchInsert(List<AuthUser> list) {
        return authUserMapper.batchInsert(list);
    }

    @Override
    public IPage<AuthUser> selectPageByQuery(AuthUserQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new IPageInfo<>(new PageInfo<>(authUserMapper.selectByExample(query.toExample())));
    }

    @Override
    @CacheEvict
    public int deleteByIdIn(Collection<Long> idCollection) {
        return authUserMapper.deleteByIdIn(idCollection);
    }


    @Override
    @Cacheable
    public AuthUserDetailResult selectDetailById(Long id) {
        return authUserMapper.selectDetailById(id);
    }
}







