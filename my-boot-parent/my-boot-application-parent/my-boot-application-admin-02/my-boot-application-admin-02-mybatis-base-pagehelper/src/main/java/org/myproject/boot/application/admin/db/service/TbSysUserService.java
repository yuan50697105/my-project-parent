package org.myproject.boot.application.admin.db.service;

import java.util.List;
import org.myproject.boot.application.admin.db.pojo.TbSysUserExample;
import org.myproject.boot.application.admin.db.pojo.TbSysUser;
public interface TbSysUserService{


    long countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysUser record);

    int insertSelective(TbSysUser record);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    TbSysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(TbSysUser record,TbSysUserExample example);

    int updateByExample(TbSysUser record,TbSysUserExample example);

    int updateByPrimaryKeySelective(TbSysUser record);

    int updateByPrimaryKey(TbSysUser record);

    int updateBatch(List<TbSysUser> list);

    int updateBatchSelective(List<TbSysUser> list);

    int batchInsert(List<TbSysUser> list);

}
