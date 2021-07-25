package com.irwan.irwanta;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import com.irwan.irwanta.helper.PermissionHelper;

public class CanvasActivity extends Activity {
    ImageButton ha,na,ca,ra,ka,da,ta,sa,wa, la,ma,ga,ba,nga, pa, ja,ya, nya;
    LayoutInflater inflater;
    View dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_aksara);
        ha = findViewById(R.id.btn_ha);
        na = findViewById(R.id.btn_na);
        ca = findViewById(R.id.btn_ca);
        ra = findViewById(R.id.btn_ra);
        ka = findViewById(R.id.btn_ka);
        da = findViewById(R.id.btn_da);
        ta = findViewById(R.id.btn_ta);
        sa = findViewById(R.id.btn_sa);
        wa = findViewById(R.id.btn_wa);
        la = findViewById(R.id.btn_la);
        ma = findViewById(R.id.btn_ma);
        ga = findViewById(R.id.btn_ga);
        ba = findViewById(R.id.btn_ba);
        nga = findViewById(R.id.btn_nga);
        pa = findViewById(R.id.btn_pa);
        ja = findViewById(R.id.btn_ja);
        ya = findViewById(R.id.btn_ya);
        nya = findViewById(R.id.btn_nya);


        ha.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ha");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ha");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();

            }
        });

        na.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","na");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","na");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ca.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ca");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ca");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ra.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ra");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ra");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ka.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ka");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ka");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        da.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","da");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","da");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ta.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ta");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ta");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        sa.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","sa");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","sa");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        wa.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","wa");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","wa");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        la.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","la");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","la");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ma.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ma");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ma");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ga.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ga");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ga");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ba.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ba");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ba");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        nga.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","nga");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","nga");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        pa.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","pa");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","pa");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ja.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ja");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ja");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        ya.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","ya");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","ya");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });

        nya.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Log.e("ini","ha");
                AlertDialog.Builder builder1 = new AlertDialog.Builder(CanvasActivity.this);
//                builder1.setMessage("Write your message here.");
                inflater = getLayoutInflater();
                dialogView = inflater.inflate(R.layout.popup, null);
                builder1.setView(R.layout.popup);
                builder1.setMessage("Apa yang ingin anda lakukan");
                builder1.setCancelable(true);
                builder1.setCancelable(true);
                builder1.setView(R.layout.kanpas);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("Form Biodata");

                builder1.setPositiveButton(
                        "Latihan",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Signature.class);
                                gas.putExtra("nama","nya");
                                startActivity(gas);
                            }
                        });

                builder1.setNegativeButton(
                        "Belajar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent gas = new Intent(CanvasActivity.this,Latihan.class);
                                gas.putExtra("nama","nya");
                                startActivity(gas);
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });


    }
}
