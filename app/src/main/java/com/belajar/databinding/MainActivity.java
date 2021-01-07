package com.belajar.databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.belajar.databinding.models.Siswa;

public class MainActivity extends AppCompatActivity {

    private Siswa siswa;
    private TextView txtNama,txtNim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSiswa();
    }
    public void setSiswa(){
        siswa = new Siswa("Ali","1931710069");
        txtNama = findViewById(R.id.txtNama);
        txtNim = findViewById(R.id.txtNim);
        txtNama.setText(siswa.getNama());
        txtNim.setText(siswa.getNim());
    }
}