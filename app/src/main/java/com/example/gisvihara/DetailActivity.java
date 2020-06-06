package com.example.gisvihara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView datanama, dataalamat, datatlpn;
    Button btncall, btnback;
    ImageView datagambar;
    public static String id,nama,alamat,telpn,gambar;
    public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.txt_nama);
        dataalamat=findViewById(R.id.txt_alamat);
        datatlpn=findViewById(R.id.txt_tlp);
        btnback=findViewById(R.id.btn_back);
        datagambar=findViewById(R.id.img_data);

        Picasso.get().load(gambar).into(datagambar);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datatlpn.setText(telpn);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
