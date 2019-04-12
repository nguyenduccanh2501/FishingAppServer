package com.example.fishingappserver.Retrofit;

import com.example.fishingappserver.Model.Category;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IFishingAPI {

    @GET("getmenu.php")
    Observable<List<Category>> getMenu();
}
