package org.myproject.boot.application.admin.db.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.myproject.boot.application.admin.db.mapper.TbOrderInfoMapper;
import org.myproject.boot.application.admin.db.service.TbOrderInfoService;

@Service
public class TbOrderInfoServiceImpl implements TbOrderInfoService {

    @Resource
    private TbOrderInfoMapper tbOrderInfoMapper;

}

