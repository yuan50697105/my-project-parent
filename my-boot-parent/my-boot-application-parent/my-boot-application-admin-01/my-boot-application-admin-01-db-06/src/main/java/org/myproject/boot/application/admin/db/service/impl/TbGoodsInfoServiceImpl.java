package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbGoodsInfoMapper;
import org.myproject.boot.application.admin.db.service.TbGoodsInfoService;
@Service
public class TbGoodsInfoServiceImpl implements TbGoodsInfoService{

    @Resource
    private TbGoodsInfoMapper tbGoodsInfoMapper;

}
