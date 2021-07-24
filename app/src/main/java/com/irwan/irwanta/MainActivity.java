package com.irwan.irwanta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private static final int INTENT_REQUEST_CODE = 100;

//    public static final String URL = "http://192.168.44.193:5000/";

    private Button belajar, latihan, keluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        initViews();

    }

    private void initViews() {

        latihan = findViewById(R.id.button);
        belajar = findViewById(R.id.belajar);
        keluar = findViewById(R.id.keluar);
        keluar.setOnClickListener((View view) -> {
           finish();
           System.exit(0);
        });

        belajar.setOnClickListener((View view) -> {
            Intent intent = new Intent(MainActivity.this,CanvasActivity.class);
            startActivity(intent);
        });

        latihan.setOnClickListener((View view) -> {
            Intent intent = new Intent(MainActivity.this,CanvasActivity.class);
            startActivity(intent);
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == INTENT_REQUEST_CODE) {
//
//            if (resultCode == RESULT_OK && data.getData()!=null) {
//                try {
//                    Uri pickedImage = data.getData();
//                    String[] filePath = { MediaStore.Images.Media.DATA };
//                    Cursor cursor = getContentResolver().query(pickedImage, filePath, null, null, null);
//                    cursor.moveToFirst();
//                    String imagePath = cursor.getString(cursor.getColumnIndex(filePath[0]));
//
////                    BitmapFactory.Options options = new BitmapFactory.Options();
////                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
////                    Bitmap bitmap = BitmapFactory.decodeFile(imagePath, options);
////                    imageView.setImageBitmap(bitmap);
//
//                    InputStream is = getContentResolver().openInputStream(data.getData());
//
////                    AsyncTaskExample asyncTask=new AsyncTaskExample();
////                    asyncTask.execute("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
//
//                    File file = new File(imagePath);
//
//                    uploadImage(getBytes(is));
////                    uploadImage(getBytes(is));
////                    uploadImageNew(getBytes(is));
//
//                    Log.d(TAG, "succeddddd: ");
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public byte[] getBytes(InputStream is) throws IOException {
//        ByteArrayOutputStream byteBuff = new ByteArrayOutputStream();
//
//        int buffSize = 1024;
//        byte[] buff = new byte[buffSize];
//
//        int len = 0;
//        while ((len = is.read(buff)) != -1) {
//            byteBuff.write(buff, 0, len);
//        }
//
//        return byteBuff.toByteArray();
//    }
//
//    private void uploadImage(byte[] imageBytes) {
//
//        Retrofit retrofit = NetworkClient.getRetrofit();
//        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
//
////        RequestBody requestFile = RequestBody.create(MediaType.parse("image/jpeg"), imageBytes);
////        RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/  form-data"), imageBytes);
////        MultipartBody.Part body = MultipartBody.Part.createFormData("image", "image.jpg", requestFile);
//
//        RequestBody requestBody = RequestBody.create(MediaType.parse("image/*"), imageBytes);
//        MultipartBody.Part body = MultipartBody.Part.createFormData("image", "image.jpg", requestBody);
////        retrofitInterface.uploadImage(body);
//        Call<Response> call = retrofitInterface.uploadImage(body);
//        mProgressBar.setVisibility(View.VISIBLE);
//        Log.d(TAG, "sukses uploadImage: ");
//
//        call.enqueue(new Callback<Response>() {
//            @Override
//            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
//
//                mProgressBar.setVisibility(View.GONE);
//
//                if (response.isSuccessful()) {
//                    Response responseBody = response.body();
////                    mBtImageShow.setVisibility(View.VISIBLE);
//                    tvClass.setText("Class: "+ responseBody.getClassnya());
//                    tvProb.setText("Prob: "+ Arrays.toString(responseBody.getProb()));
//
//                    String classnya = responseBody.getClassnya();
//                    Log.d(TAG, "classnya nih: "+ classnya );
//                    Log.d(TAG, "probnya nih: "+ Arrays.toString(responseBody.getProb()));
//
//                } else {
//                    Log.d(TAG, "gagal nih: ");
//                    ResponseBody errorBody = response.errorBody();
//
//                    Gson gson = new Gson();
//
//                    try {
//                        Response errorResponse = gson.fromJson(errorBody.string(), Response.class);
//                        Snackbar.make(findViewById(R.id.content), errorResponse.getClassnya(),Snackbar.LENGTH_SHORT).show();
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Response> call, Throwable t) {
//
//                mProgressBar.setVisibility(View.GONE);
//                Log.d(TAG, "onFailure: "+t.getLocalizedMessage());
//            }
//        });
//
////        Log.d(TAG, "sukses uploadImage: ");
//    }
//
//
//    private class AsyncTaskExample extends AsyncTask<String, String, String> {
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
////            p = new ProgressDialog(MainActivity.this);
////            p.setMessage("Please wait...It is downloading");
////            p.setIndeterminate(false);
////            p.setCancelable(false);
////            p.show();
//        }
//        @Override
//        protected String doInBackground(String... strings) {
//            //                ImageUrl = new URL(strings[0]);
////                HttpURLConnection conn = (HttpURLConnection) ImageUrl.openConnection();
////                conn.setDoInput(true);
////                conn.connect();
////                is = conn.getInputStream();
////                BitmapFactory.Options options = new BitmapFactory.Options();
////                options.inPreferredConfig = Bitmap.Config.RGB_565;
////                bmImg = BitmapFactory.decodeStream(is, null, options);
//            return "bmImg";
//        }
//
//    }


}