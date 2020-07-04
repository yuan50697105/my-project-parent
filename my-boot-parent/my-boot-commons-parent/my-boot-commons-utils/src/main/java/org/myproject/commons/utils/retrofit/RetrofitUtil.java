package org.myproject.commons.utils.retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.guava.GuavaCallAdapterFactory;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @program: my-boot-commons-parent
 * @description:
 * @author: yuane
 * @create: 2020-07-04 18:35
 */
public class RetrofitUtil {
    public static Retrofit retrofit(String baseUrl) {
        return new Retrofit.Builder()
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addCallAdapterFactory(GuavaCallAdapterFactory.create())
                .addConverterFactory(JacksonConverterFactory.create()).baseUrl(baseUrl).build();
    }

}