package com.irwan.irwanta.canvas;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.irwan.irwanta.NetworkClient;
import com.irwan.irwanta.R;
import com.irwan.irwanta.Response;
import com.irwan.irwanta.RetrofitInterface;
//import com.pranburiorchard.netfirms.simpleandroidocr.utils.BitmapUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
//import javax.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;


public class WriteCanvas extends View {
    int jum=0;
    long waktu;
    String Kelas;
    private Paint mPaint;
    private Path mPath;
    float[][] keluar;
    private String modeltf = "rgbmodel.tflite";
    private Canvas mCanvas;

    private String[] unama;
    public WriteCanvas(Context context) {
        super(context);
        init();
    }

    public WriteCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String nilai) {
        this.Kelas = nilai;
    }

    private void init() {
        // Init Neural Network instance
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(25);
        mPath = new Path();
        mCanvas = new Canvas();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                mPath.moveTo(event.getX(), event.getY());
                break;

            case MotionEvent.ACTION_MOVE:
                mPath.lineTo(event.getX(), event.getY());
                invalidate();
                break;

            case MotionEvent.ACTION_UP:
                break;
        }

        return true;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Bitmap mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
    }

    public void clear() {
        mPath.reset();
        invalidate();
    }


    public byte[] simpan(String n){
        byte [] balik =null;
        this.setDrawingCacheEnabled(true);
        Bitmap b2 = Bitmap.createScaledBitmap(getDrawingCache(), 64, 64, false);
        // Bitmap gray = BitmapUtils.convertToGray(b2);
        Bitmap newBitmap = Bitmap.createBitmap(b2.getWidth(), b2.getHeight(), b2.getConfig());
        Canvas canvas = new Canvas(newBitmap);
        canvas.drawColor(Color.WHITE);
        canvas.drawBitmap(b2, 0, 0, null);
        String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/DataAksara";

        String tang = java.text.DateFormat.getDateTimeInstance().format(new Date());
        Log.i("path ",dirPath);
        File dir = new File(dirPath);
        if (!dir.exists())
            dir.mkdirs();
        String nama = n+" ("+String.valueOf(tang)+").png";
        File file = new File(dirPath, nama);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        newBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            newBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fOut);
            fOut.flush();
            fOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        };
        try {

//                    BitmapFactory.Options options = new BitmapFactory.Options();
//                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
//                    Bitmap bitmap = BitmapFactory.decodeFile(imagePath, options);
//                    imageView.setImageBitmap(bitmap);
            byte [] data = stream.toByteArray();
            InputStream is = new ByteArrayInputStream(data);

//                    AsyncTaskExample asyncTask=new AsyncTaskExample();
//                    asyncTask.execute("https://www.tutorialspoint.com/images/tp-logo-diamond.png");

//           Kelas= uploadImage(getBytes(is));
//            Kelas= uploadImage(getBytes(is));

//                    uploadImage(getBytes(is));
//                    uploadImageNew(getBytes(is));

            Log.e("upload", "succeddddd: ");

            balik = getBytes(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setDrawingCacheEnabled(false);
        b2.recycle();
        newBitmap.recycle();
        return balik;

    }

    public byte[] getBytes(InputStream is) throws IOException {
        ByteArrayOutputStream byteBuff = new ByteArrayOutputStream();

        int buffSize = 1024;
        byte[] buff = new byte[buffSize];

        int len = 0;
        while ((len = is.read(buff)) != -1) {
            byteBuff.write(buff, 0, len);
        }

        return byteBuff.toByteArray();
    }


}
