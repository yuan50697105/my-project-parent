package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbGoodsTypeMapper;
import org.myproject.boot.application.admin.db.service.TbGoodsTypeService;
@Service
public class TbGoodsTypeServiceImpl implements TbGoodsTypeService{

    @Resource
    private TbGoodsTypeMapper tbGoodsTypeMapper;

}
