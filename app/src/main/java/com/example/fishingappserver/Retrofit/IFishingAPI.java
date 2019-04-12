package com.example.fishingappserver.Retrofit;

import com.example.fishingappserver.Model.Category;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface IFishingAPI {

    @GET("getmenu.php")
    Observable<List<Category>> getMenu();

    @FormUrlEncoded
    @POST("server/category/addcategory.php")
    Observable<String> addNewCategory(@Field("name") String name, @Field("imgPath") String imgPath);

    @Multipart
    @POST("server/category/upload_category.php")
    Call<String> uploadCategoryFile(@Part MultipartBody.Part file);

}
