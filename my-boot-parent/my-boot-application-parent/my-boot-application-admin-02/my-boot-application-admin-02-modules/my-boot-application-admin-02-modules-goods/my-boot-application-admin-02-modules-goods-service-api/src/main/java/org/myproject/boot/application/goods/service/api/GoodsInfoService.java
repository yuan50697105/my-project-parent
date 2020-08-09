package org.myproject.boot.application.goods.service.api;

import org.myproject.boot.application.commons.pojo.IPage;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoAoDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoQueryDTO;
import org.myproject.boot.application.goods.service.pojo.GoodsInfoVoDTO;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:37
 */
public interface GoodsInfoService {
    void save(GoodsInfoVoDTO dto);

    void delete(Long id);

    GoodsInfoAoDTO get(Long id);

    List<GoodsInfoAoDTO> list(GoodsInfoQueryDTO queryDTO);

    IPage<GoodsInfoAoDTO> list(GoodsInfoQueryDTO queryDTO, int page, int limit);
}
