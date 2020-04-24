package com.test.one.utils;

import okhttp3.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class OkhttpUtils {
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(OkhttpUtils.class);
    static OkHttpClient okHttpClient = new OkHttpClient();
    public static final MediaType Json = MediaType.parse("application/json;charset=utf-8");


    public static void get(String url) throws IOException {


        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            System.out.println("请求成功");
            System.out.println(response.body().string());
        } else {
            throw new IOException("Error" + response.toString());
        }
    }

    public static void post(String url, Object object) throws IOException {
        Response response = null;
        try {
            FormBody.Builder body = new FormBody.Builder();

            Map<String, Object> map = BeanMapUtils.convertBean(object);

            Iterator<String> iterator = map.keySet().iterator();
            if (iterator.hasNext()) {
                body.add(iterator.next(), (String) map.get(iterator.next()));
            }

            RequestBody requestBody = body.build();
            Request request = new Request.Builder().url(url).post(requestBody).build();
            response = okHttpClient.newCall(request).execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (response == null) {
            logger.info("空指针");
            return;
        }
        if (response.isSuccessful()) {
            if (response.code() == 200) {
                System.out.println();
                logger.info("请求成功，返回码是" + response.code());
            }
            logger.info("请求地址是" + url + ",返回码是" + response.code());

        } else {

        }
    }


    public static String jsonRequest(String url, String json) throws IOException {

        RequestBody requestBody = RequestBody.create(Json, json);

        Request request = new Request.Builder().url(url).post(requestBody).build();
//        okHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                System.out.println(e.toString());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                System.out.println(response.body().string());
//
//            }
//        });·
        Response response = okHttpClient.newCall(request).execute();


        return response.body().string();
    }


//    public class TokenHeaderInterceptor implements Interceptor {
//
//        @Override
//        public Response intercept(Chain chain) throws IOException{
//            String token = MainDataManager.getInstance().getToken();
//            if (token.isEmpty()) {
//                Request originalRequest = chain.request();
//                return chain.proceed(originalRequest);
//            }else {
//                Request originalRequest = chain.request();
//                Request updateRequest = originalRequest.newBuilder().header("token", token).build();
//                return chain.proceed(updateRequest);
//            }
//        }
//
//    }
}







