package com.ozkanseyyarer.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BilgisayarAracGerecleri extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private String[] aletDizisi = {"Monitör","Anakart","Bilgisayar Bataryası","Mouse",
            "İşlemci","Adaptör","RAM","Ekran Kartı","USB","SSD","HDD","Klavye"};
    private String[] aletAciklamasi = new String[12];
    private int[] aletResimleri={R.drawable.monitor,R.drawable.anakart
            ,R.drawable.batarya,R.drawable.mouse,R.drawable.islemci,R.drawable.adaptor,
            R.drawable.ram,R.drawable.ekrankarti,R.drawable.usb,R.drawable.ssd,R.drawable.hdd,R.drawable.klavye};
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgisayar_arac_gerecleri);

        listView = findViewById(R.id.lstAletlerXML);
        adapter = new ArrayAdapter<>(BilgisayarAracGerecleri.this, android.R.layout.simple_list_item_activated_1,aletDizisi);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent = new Intent(BilgisayarAracGerecleri.this, DetailsActivity2.class);
                intent.putExtra("aletinismi",aletDizisi[i]);
                intent.putExtra("aletinaciklamasi",aletAciklamasi[i]);
                intent.putExtra("aletinresmi",aletResimleri[i]);
                startActivity(intent);
            }
        });
    }
}
