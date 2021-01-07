package com.belajar.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.belajar.databinding.databinding.ActivityMainBinding;
import com.belajar.databinding.models.Siswa;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Siswa siswa = new Siswa("Ali","1931710069");
        binding.setSiswa(siswa);
    }


}