package com.irwan.irwanta;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitInterface {
    @Multipart
    @POST("predict-image")
    Call<Response> uploadImage(@Part MultipartBody.Part image);

//    @Multipart
//    @POST("user/updateprofile")
//    Observable<ResponseBody> updateProfile(@Part MultipartBody.Part image);

}