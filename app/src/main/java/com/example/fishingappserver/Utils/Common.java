package com.example.fishingappserver.Utils;

import com.example.fishingappserver.Retrofit.IFishingAPI;
import com.example.fishingappserver.Retrofit.RetrofitClient;

public class Common {
    public static final String BASE_URL = "http://192.168.1.211/fishingapp/";
    public static IFishingAPI getAPI(){
        return RetrofitClient.getClients(BASE_URL).create(IFishingAPI.class);
    }
}
