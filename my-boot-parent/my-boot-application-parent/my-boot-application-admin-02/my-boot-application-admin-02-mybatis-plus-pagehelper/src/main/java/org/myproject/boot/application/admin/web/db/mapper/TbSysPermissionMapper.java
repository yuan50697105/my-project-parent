package org.myproject.boot.application.admin.web.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermission;
import org.myproject.boot.application.admin.web.db.pojo.TbSysPermissionExample;

@Mapper
public interface TbSysPermissionMapper extends BaseMapper<TbSysPermission> {
    long countByExample(TbSysPermissionExample example);

    int deleteByExample(TbSysPermissionExample example);

    List<TbSysPermission> selectByExample(TbSysPermissionExample example);

    int updateByExampleSelective(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);

    int updateByExample(@Param("record") TbSysPermission record, @Param("example") TbSysPermissionExample example);
}