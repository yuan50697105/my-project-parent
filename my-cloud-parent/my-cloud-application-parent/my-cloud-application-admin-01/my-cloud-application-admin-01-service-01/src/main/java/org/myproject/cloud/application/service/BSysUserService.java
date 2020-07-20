package org.myproject.cloud.application.service;

import org.myproject.cloud.application.admin.api.base.BSysUserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-17 23:46
 */
@FeignClient("cloud-api")
public interface BSysUserService extends BSysUserApi {
}