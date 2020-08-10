package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRole;
import org.myproject.boot.application.admin.db.pojo.TbSysUserRoleExample;

@Mapper
public interface TbSysUserRoleMapper extends BaseMapper<TbSysUserRole> {
    long countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    int updateByExampleSelective(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByExample(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);
}