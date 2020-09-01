package org.myproject.app.db.area.service;

import org.myproject.app.db.area.pojo.AreaInfo;
import org.myproject.app.db.area.pojo.AreaInfoExample;
import org.myproject.app.db.area.pojo.AreaInfoQuery;
import org.myproject.app.db.area.pojo.AreaInfoVo;
import org.myproject.app.db.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface AreaInfoService {


    long countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaInfo record);

    int insertOrUpdate(AreaInfo record);

    int insertOrUpdateSelective(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(AreaInfo record, AreaInfoExample example);

    int updateByExample(AreaInfo record, AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);

    List<AreaInfo> selectAllByIdIn(Collection<Long> idCollection);

    List<AreaInfo> selectAllByCodeContaining(String containingCode);

    int deleteByIdIn(Collection<Long> idCollection);

    int updateBatch(List<AreaInfo> list);

    int batchInsert(List<AreaInfo> list);

    IPage<AreaInfo> selectPageByQuery(AreaInfoQuery query);

    int insert(AreaInfoVo areaInfoVo);

    int updateByPrimaryKeySelective(AreaInfoVo areaInfoVo);
}
