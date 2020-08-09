package org.myproject.boot.application.admin.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;

@Mapper
public interface TbSysRoleMapper extends BaseMapper<TbSysRole> {
    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByExample(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);
}