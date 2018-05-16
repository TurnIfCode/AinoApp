package com.aino.ainoapp.api;

public class UtilsApi {
    public static final String BASE_URL_API = "http://192.168.100.7/aino/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
