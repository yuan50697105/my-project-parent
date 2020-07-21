package org.myproject.boot.application.admin.api.impl;


import org.myproject.boot.application.admin.api.pojo.BGoodsInfo;
import org.myproject.boot.application.admin.api.pojo.BGoodsInfoQuery;
import org.myproject.boot.application.admin.api.pojo.BGoodsInfoVo;
import org.myproject.boot.application.admin.api.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
public interface BGoodsInfoApi {
    IPage<BGoodsInfo> selectByQuery(BGoodsInfoQuery query, int page, int size);

    List<BGoodsInfo> selectByQuery(BGoodsInfoQuery query);

    BGoodsInfo get(Long id);

    void save(BGoodsInfoVo vo);

    void update(BGoodsInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
