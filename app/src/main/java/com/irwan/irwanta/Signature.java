package com.irwan.irwanta;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.irwan.irwanta.R;
import com.irwan.irwanta.canvas.WriteCanvas;


import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.util.Arrays;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

import static android.content.ContentValues.TAG;


public class Signature extends AppCompatActivity {

    private WriteCanvas wv;
    private TextView tv,times, klas,huruf;
    Button clearBtn, verifyBtn;
    String target;
    DecimalFormat df = new DecimalFormat("#.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1001);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                1002);
        setContentView(R.layout.kanpas);
        klas = findViewById(R.id.kelas);
        huruf = findViewById(R.id.huruf);
        clearBtn = findViewById(R.id.game_clear_btn);
        wv = findViewById(R.id.writecanvas);
        verifyBtn = findViewById(R.id.game_ok_btn);
        if(getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            target = bundle.getString("nama");
            huruf.setText(target);
            Log.d("target",target);
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


    //    /**
//     * Callback received when a permissions request has been completed.
//     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {

        switch (requestCode) {
            case 1001:
                // BEGIN_INCLUDE(permission_result)
                // Received permission result for camera permission.
                Log.i(TAG, "Received response for SDCARD permission request.");

                // Check if the only required permission has been granted
                if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Camera permission has been granted, preview can be displayed
                    Log.i(TAG, "SDCARD permission has now been granted. Showing preview.");

                } else {
                    Log.i(TAG, "SDCARD permission was NOT granted.");

                }
                // END_INCLUDE(permission_result)

                break;
            case 1002:
                // BEGIN_INCLUDE(permission_result)
                // Received permission result for camera permission.
                Log.i(TAG, "Received response for SDCARD permission request.");

                // Check if the only required permission has been granted
                if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Camera permission has been granted, preview can be displayed
                    Log.i(TAG, "SDCARD permission has now been granted. Showing preview.");

                } else {
                    Log.i(TAG, "SDCARD permission was NOT granted.");

                }
                // END_INCLUDE(permission_result)

                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                break;
        }
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
