package com.ozkanseyyarer.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnBilgisayarAracGerecleri;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBilgisayarAracGerecleri = findViewById(R.id.activity_main_btnBilgisayarAracGerecleri);

        btnBilgisayarAracGerecleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, BilgisayarAracGerecleri.class);
                startActivity(intent);
            }
        });
    }
}
