package org.myproject.cloud.application.admin.api.policy;

import lombok.AllArgsConstructor;
import org.myproject.cloud.application.admin.api.api.BCustomerInfoApi;
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
@AllArgsConstructor
public class BCustomerInfoPolicy {
    @Autowired
    private final Map<String, BCustomerInfoApi> map = new ConcurrentHashMap<>();

    public BCustomerInfoApi get(String key) {
        return map.get(key);
    }

    public Map<String, BCustomerInfoApi> getMap() {
        return map;
    }
}