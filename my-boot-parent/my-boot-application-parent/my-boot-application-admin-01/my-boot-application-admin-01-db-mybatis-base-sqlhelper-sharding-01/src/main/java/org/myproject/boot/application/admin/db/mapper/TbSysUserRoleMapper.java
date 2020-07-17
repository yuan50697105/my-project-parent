package org.myproject.boot.application.admin.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

@Mapper
public interface TbSysUserRoleMapper {
    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysUserRole record);

    int insertSelective(TbSysUserRole record);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    TbSysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByExample(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByPrimaryKeySelective(TbSysUserRole record);

    int updateByPrimaryKey(TbSysUserRole record);
}