package org.myproject.boot.application.admin.mvc.api.service.retrofit;

import com.github.lianjiatech.retrofit.plus.annotation.RetrofitClient;
import org.springframework.stereotype.Component;
import retrofit2.http.GET;

/**
 * @program: my-project-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-21 15:51
 */
@Component
@RetrofitClient(baseUrl = "${service.baseUrl}")
public interface RetrofitSysUserService {
    @GET("")
    String get();
}
