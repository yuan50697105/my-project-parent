package org.myproject.boot.application.admin.service.policy;

import org.myproject.boot.application.admin.service.api.BCustomerInfoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-12 09:21
 */
@Component
public class BCustomerInfoPolicy {
    @Autowired
    private Map<String, BCustomerInfoApi> map = new ConcurrentHashMap<>();

    public BCustomerInfoApi get(String key) {
        return map.get(key);
    }

    public Map<String, BCustomerInfoApi> getMap() {
        return map;
    }
}