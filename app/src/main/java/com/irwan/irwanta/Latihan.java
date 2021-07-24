package com.irwan.irwanta;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.irwan.irwanta.R;
import com.irwan.irwanta.Signature;
import com.irwan.irwanta.Splash;
import com.irwan.irwanta.canvas.WriteCanvas;
import com.irwan.irwanta.canvas.WriteCanvas;

import java.io.IOException;
import java.util.Arrays;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class Latihan extends AppCompatActivity {
    String target;
    Button clearBtn, verifyBtn;
    private WriteCanvas wv;
    TextView klas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tulis);
        clearBtn =findViewById(R.id.clear);
        verifyBtn = findViewById(R.id.tes);
        wv = findViewById(R.id.writecanvas);
        klas = findViewById(R.id.kelas);
        if(getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            target = bundle.getString("nama");
            Log.d("target",target);
        }
        if (target.equals("ha")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ha1).into(imageView);
        }
        if (target.equals("na")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.na1).into(imageView);
        }
        if (target.equals("ca")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ca1).into(imageView);
        }
        if (target.equals("ra")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ra1).into(imageView);
        }
        if (target.equals("ka")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ka1).into(imageView);
        }
        if (target.equals("da")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.da1).into(imageView);
        }
        if (target.equals("ta")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ta1).into(imageView);
        }
        if (target.equals("sa")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.sa1).into(imageView);
        }
        if (target.equals("wa")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.wa1).into(imageView);
        }
        if (target.equals("la")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.la1).into(imageView);
        }
        if (target.equals("ma")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ma1).into(imageView);
        }
        if (target.equals("ga")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ga1).into(imageView);
        }
        if (target.equals("ba")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ba1).into(imageView);
        }
        if (target.equals("nga")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.nga1).into(imageView);
        }
        if (target.equals("pa")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.pa1).into(imageView);
        }
        if (target.equals("ja")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ja1).into(imageView);
        }
        if (target.equals("ya")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.ya1).into(imageView);
        }
        if (target.equals("nya")){
            ImageView imageView = findViewById(R.id.gambar);
            Glide.with(this).load(R.mipmap.nya1).into(imageView);
        }
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tv.setText("  ?");
                wv.clear();
                wv.invalidate();
            }
        });

        verifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("verify", "suukkses");

                uploadImage(wv.simpan("ha"));
                wv.invalidate();
            }
        });

    }

    private void uploadImage(byte[] imageBytes) {
        String hasil;
        Retrofit retrofit = NetworkClient.getRetrofit();
        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);

//        RequestBody requestFile = RequestBody.create(MediaType.parse("image/jpeg"), imageBytes);
//        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/  form-data"), imageBytes);
//        MultipartBody.Part body = MultipartBody.Part.createFormData("image", "image.jpg", requestFile);

        RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), imageBytes);
        MultipartBody.Part body = MultipartBody.Part.createFormData("image", "image.jpg", requestBody);
//        retrofitInterface.uploadImage(body);
        Call<Response> call = retrofitInterface.uploadImage(body);
//        mProgressBar.setVisibility(View.VISIBLE);
        Log.d("mantap", "sukses uploadImage: ");

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {


                if (response.isSuccessful()) {
                    Response responseBody = response.body();
//                    mBtImageShow.setVisibility(View.VISIBLE);

                    String hasil = responseBody.getClassnya();
                    if (hasil.equals(target))
                        klas.setText("Benar");
                    else
                        klas.setText("Salah");
                    Log.e("cek", "classnya nih: "+ hasil );
                    Log.e("cek", "probnya nih: "+ Arrays.toString(responseBody.getProb()));

                } else {
                    Log.e("TAG", "gagal nih: ");
                    ResponseBody errorBody = response.errorBody();

                    Gson gson = new Gson();

                    try {
                        Response errorResponse = gson.fromJson(errorBody.string(), Response.class);
                        Snackbar.make(findViewById(R.id.content), errorResponse.getClassnya(),Snackbar.LENGTH_SHORT).show();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

//                mProgressBar.setVisibility(View.GONE);
                Log.d("gagal", "onFailure: "+t.getLocalizedMessage());
            }
        });
//        Log.d(TAG, "sukses uploadImage: ");
    }


    private class AsyncTaskExample extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
//            p = new ProgressDialog(MainActivity.this);
//            p.setMessage("Please wait...It is downloading");
//            p.setIndeterminate(false);
//            p.setCancelable(false);
//            p.show();
        }
        @Override
        protected String doInBackground(String... strings) {
            //                ImageUrl = new URL(strings[0]);
//                HttpURLConnection conn = (HttpURLConnection) ImageUrl.openConnection();
//                conn.setDoInput(true);
//                conn.connect();
//                is = conn.getInputStream();
//                BitmapFactory.Options options = new BitmapFactory.Options();
//                options.inPreferredConfig = Bitmap.Config.RGB_565;
//                bmImg = BitmapFactory.decodeStream(is, null, options);
            return "bmImg";
        }

    }


}
