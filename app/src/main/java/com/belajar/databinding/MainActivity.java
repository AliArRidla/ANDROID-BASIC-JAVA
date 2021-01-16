package com.belajar.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.belajar.databinding.databinding.ActivityMainBinding;
import com.belajar.databinding.models.Siswa;

public class MainActivity extends AppCompatActivity {

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        Siswa siswa = new Siswa();
        binding.setSiswa(siswa);
        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtResult.setText(binding.txtEdit.getText().toString());
            }
        });
    }


}