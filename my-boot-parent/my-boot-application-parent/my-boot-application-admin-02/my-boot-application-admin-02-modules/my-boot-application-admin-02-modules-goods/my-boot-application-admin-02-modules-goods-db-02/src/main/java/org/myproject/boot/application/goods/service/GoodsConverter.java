package org.myproject.boot.application.goods.service;

import com.github.pagehelper.PageInfo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.myproject.boot.application.goods.commons.pojo.*;
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

    TbGoodsInfoQuery infoQuery(GoodsInfoQuery query);

    TbGoodsInfo infoVo(GoodsInfoVo goodsInfoVo );

    GoodsInfoAo infoAo(TbGoodsInfo selectByPrimaryKey);

    List<GoodsInfoAo> infoAos(List<TbGoodsInfo> tbGoodsInfos);

    PageInfo<GoodsInfoAo> infoAos(PageInfo<TbGoodsInfo> pageInfo);

    TbGoodsTypeQuery typeQuery(GoodsTypeQuery query);

    TbGoodsType typeVo(GoodsTypeVo goodsTypeVo);

    GoodsTypeAo typeAo(TbGoodsType tbGoodsType);

    List<GoodsTypeAo> typeAos(List<TbGoodsType> list);

    PageInfo<GoodsTypeAo> typeAos(PageInfo<TbGoodsType> pageInfo);

    void copyType(GoodsTypeVo goodsTypeVo, @MappingTarget TbGoodsType tbGoodsType);
}
