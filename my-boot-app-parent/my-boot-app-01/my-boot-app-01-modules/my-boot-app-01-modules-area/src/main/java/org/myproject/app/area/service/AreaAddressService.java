package org.myproject.app.area.service;

import org.myproject.app.area.pojo.AreaAddress;
import org.myproject.app.area.pojo.AreaAddressExample;
import org.myproject.app.area.pojo.AreaAddressQuery;
import org.myproject.app.area.pojo.AreaAddressVo;
import org.myproject.app.commons.pojo.IPage;

import java.util.Collection;
import java.util.List;

public interface AreaAddressService {


    long countByExample(AreaAddressExample example);

    int deleteByExample(AreaAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AreaAddress record);

    int insertOrUpdate(AreaAddress record);

    int insertOrUpdateSelective(AreaAddress record);

    int insertSelective(AreaAddress record);

    List<AreaAddress> selectByExample(AreaAddressExample example);

    AreaAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(AreaAddress record, AreaAddressExample example);

    int updateByExample(AreaAddress record, AreaAddressExample example);

    int updateByPrimaryKeySelective(AreaAddress record);

    int updateByPrimaryKey(AreaAddress record);

    int updateBatch(List<AreaAddress> list);

    int batchInsert(List<AreaAddress> list);

    IPage<AreaAddress> selectPageByQuery(AreaAddressQuery query);

    int insert(AreaAddressVo areaAddressVo);

    List<AreaAddress> selectAllByIdIn(Collection<Long> idCollection);

    List<AreaAddress> selectAllByAreaIdIn(Collection<Long> areaIdCollection);

    AreaAddress selectOneByAreaId(Long areaId);

    int deleteByIdIn(Collection<Long> idCollection);

    int deleteByAreaId(Long areaId);

    int deleteByAreaIdIn(Collection<Long> areaIdCollection);

    int updateByPrimaryKeySelective(AreaAddressVo areaAddressVo);
}

