package org.myproject.cloud.application.admin.api.impl;

import org.myproject.cloud.application.admin.api.base.BOrderInfoApi;
import org.myproject.cloud.application.admin.api.feign.BOrderInfoFeignApi;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-15 19:58
 */
@RestController
@Transactional
public class BOrderInfoApiImpl implements BOrderInfoApi, BOrderInfoFeignApi {
}