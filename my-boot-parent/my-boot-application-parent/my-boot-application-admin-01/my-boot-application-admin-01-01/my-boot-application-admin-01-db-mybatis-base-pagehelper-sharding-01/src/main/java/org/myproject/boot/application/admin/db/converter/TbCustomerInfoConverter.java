package org.myproject.boot.application.admin.db.converter;

import cn.hutool.extra.pinyin.PinyinUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfo;
import org.myproject.boot.application.admin.db.pojo.TbCustomerInfoVo;
import org.myproject.boot.application.admin.db.pojo.TbGoodsInfoVo;

/**
 * @program: my-boot-parent
 * @description:
 * @author: yuane
 * @create: 2020-06-29 22:08
 */
@Mapper(componentModel = "spring")
public interface TbCustomerInfoConverter {
    @Mapping(target = "namePy", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getPinyin(tbCustomerInfoVo.getName()))")
    @Mapping(target = "namePyF", expression = "java(cn.hutool.extra.pinyin.PinyinUtil.getFirstLetter(tbCustomerInfoVo.getName(),null))")
    TbCustomerInfo voToPo(TbCustomerInfoVo tbCustomerInfoVo);
}
