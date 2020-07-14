package org.myproject.boot.application.admin.service.api;


import org.myproject.boot.application.admin.service.pojo.GoodsInfo;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoQuery;
import org.myproject.boot.application.admin.service.pojo.GoodsInfoVo;
import org.myproject.boot.mybatis.commons.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:23
 */
public interface BGoodsInfoApi {
    IPage<GoodsInfo> selectByQuery(GoodsInfoQuery query, int page, int size);

    List<GoodsInfo> selectByQuery(GoodsInfoQuery query);

    GoodsInfo get(Long id);

    void save(GoodsInfoVo vo);

    void update(GoodsInfoVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
