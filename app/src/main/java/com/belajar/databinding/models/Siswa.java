package com.belajar.databinding.models;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Siswa extends BaseObservable {
 private String nama;

 public Siswa(){

 }

 public Siswa(String inputNama){
     this.nama = inputNama;
 }
    @Bindable
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        notifyPropertyChanged(BR.nama);
    }
}
