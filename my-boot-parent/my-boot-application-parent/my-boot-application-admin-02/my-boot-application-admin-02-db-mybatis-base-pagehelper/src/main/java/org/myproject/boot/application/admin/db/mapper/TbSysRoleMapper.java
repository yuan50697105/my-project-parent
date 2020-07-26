package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysRole;
import org.myproject.boot.application.admin.db.pojo.TbSysRoleExample;

import java.util.List;

@Mapper
public interface TbSysRoleMapper {
    long countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TbSysRole record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    int updateByExampleSelective(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByExample(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);
}