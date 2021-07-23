package com.irwan.irwanta;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadApis {
    @Multipart
    @POST("upload-image")
    Call<RequestBody> uploadImage(@Part MultipartBody.Part part, @Part("name") RequestBody requestBody);

    @Multipart
    @POST("upload-image")
    Call<RequestBody> uploadImage2(@Part("image") RequestBody requestBody);

    @Multipart
    @POST("upload-image")
    Call<RequestBody> uploadImage3(@Part MultipartBody.Part image);
}
