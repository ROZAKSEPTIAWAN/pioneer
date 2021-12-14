package com.example.pioneer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tentang,formulir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tentang=(Button) findViewById(R.id.tentang);
        formulir=(Button) findViewById(R.id.formulir);

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tentang Aplikasi",Toast.LENGTH_LONG).show();
                about();
            }
        });


    }


    public void panggil(View view){
        String nomor = "0816888568";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);

    }
    public void about (){
        Intent about = new Intent (MainActivity.this,Tentang.class);
        startActivity(about);
    }

    public void form (View view){
        Intent formulir = new Intent(MainActivity.this,formulir.class);
        startActivity(formulir);
    }
}