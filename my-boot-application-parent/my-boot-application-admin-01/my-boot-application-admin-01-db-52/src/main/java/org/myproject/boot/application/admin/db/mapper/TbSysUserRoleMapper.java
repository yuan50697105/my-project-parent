package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

import java.util.List;

@Mapper
public interface TbSysUserRoleMapper extends BaseMapper<TbSysUserRole> {
    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    int updateByExampleSelective(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByExample(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSysUserRole record);

    int insertSelective(TbSysUserRole record);

    TbSysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSysUserRole record);

    int updateByPrimaryKey(TbSysUserRole record);
}