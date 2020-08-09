package org.myproject.boot.application.goods.service;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfo;
import org.myproject.boot.application.goods.db.pojo.TbGoodsInfoQuery;
import org.myproject.boot.application.goods.db.pojo.TbGoodsType;
import org.myproject.boot.application.goods.db.pojo.TbGoodsTypeQuery;
import org.myproject.boot.application.goods.service.pojo.*;

import java.util.List;

/**
 * @program: my-boot-application-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-08-09 13:35
 */
@Mapper(componentModel = "spring")
public interface GoodsConverter {

    TbGoodsInfoQuery infoQuery(GoodsInfoQueryDTO queryDTO);

    TbGoodsInfo infoVo(GoodsInfoVoDTO dto);

    GoodsInfoAoDTO infoAo(TbGoodsInfo selectByPrimaryKey);

    List<GoodsInfoAoDTO> infoAos(List<TbGoodsInfo> tbGoodsInfos);

    PageInfo<GoodsInfoAoDTO> infoAos(PageInfo<TbGoodsInfo> pageInfo);

    TbGoodsTypeQuery typeQuery(GoodsTypeQueryDTO queryDTO);

    TbGoodsType typeVo(GoodsTypeVoDTO goodsTypeVoDTO);

    GoodsTypeAoDTO typeAo(TbGoodsType tbGoodsType);

    List<GoodsTypeAoDTO> typeAos(List<TbGoodsType> list);

    PageInfo<GoodsTypeAoDTO> typeAos(PageInfo<TbGoodsType> pageInfo);
}
