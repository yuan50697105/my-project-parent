package org.myproject.boot.application.admin.api.api;


import org.myproject.boot.application.admin.api.pojo.BGoodsType;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeQuery;
import org.myproject.boot.application.admin.api.pojo.BGoodsTypeVo;
import org.myproject.boot.application.admin.api.pojo.IPage;

import java.util.List;

/**
 * @program: my-boot-application-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-07-05 16:03
 */
public interface BGoodsTypeApi {
    IPage<BGoodsType> selectByQuery(BGoodsTypeQuery query, int page, int size);

    List<BGoodsType> selectByQuery(BGoodsTypeQuery query);

    BGoodsType get(Long id);

    void save(BGoodsTypeVo vo);

    void update(BGoodsTypeVo vo);

    void delete(List<Long> ids);

    void delete(Long id);
}
