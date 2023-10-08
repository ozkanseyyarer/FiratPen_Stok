package com.ozkanseyyarer.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity2 extends AppCompatActivity {
    private ImageView aletinResmi;
    private EditText stokGirisi;
    private TextView aletinIsmi, stok_adeti;
    private int sAletinResmi;
    private String sAletinIsmi;
    private Button btnKaydet;
    private String aletinIsmiFromIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);


        btnKaydet = findViewById(R.id.btnKaydet);
        stok_adeti = findViewById(R.id.textview_StokBilgisi);
        aletinResmi = findViewById(R.id.imgAlet);
        aletinIsmi = findViewById(R.id.txtaletIsmi);
        stokGirisi = findViewById(R.id.editText_stokGirisi);

        Intent getintent = getIntent();
        sAletinIsmi = getIntent().getStringExtra("aletinismi");
        sAletinResmi = getintent.getIntExtra("aletinresmi", -1);

        aletinIsmi.setText(sAletinIsmi);
        aletinResmi.setImageResource(sAletinResmi);

        aletinIsmiFromIntent = sAletinIsmi;


        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String yeniStokAdeti = stokGirisi.getText().toString();
                stok_adeti.setText(yeniStokAdeti);
            }
        });
    }


}
