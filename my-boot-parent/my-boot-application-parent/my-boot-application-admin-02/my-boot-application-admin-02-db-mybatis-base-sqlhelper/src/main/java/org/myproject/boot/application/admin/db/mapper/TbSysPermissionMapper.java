package org.myproject.boot.application.admin.db.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.db.pojo.TbSysPermissionExample;

import java.util.List;

@Mapper
public interface TbSysPermissionMapper {
    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TbSysPermission record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TbSysPermission record);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    int updateByExampleSelective(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);

    int updateByExample(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);
}