/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdatapegawaii;

import java.io.*;

/**
 *
 * @author YUNITA
 */

public class DataPegawai {

    private int nip;
    private String nama;
    private String alamat;
    private int jumlah_hari_lembur;
    private int gaji_pokok;
    private int total_gaji;


    //Konstruktor
    public DataPegawai() {
    
    }
    
    //Fungsi-fungsi mutator
    public void setnip(int NIP){
        nip = NIP;
    }
    
    public void setnama(String Nama){
        nama = Nama;
    }
    
    public void setalamat(String Alamat){
        alamat = Alamat;
    }
    
    public void setjumlah_hari_lembur(int Jumlah_hari_lembur){
        jumlah_hari_lembur = Jumlah_hari_lembur;
    }
    
    // Acessor
    public int getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlah_hari_lembur() {
        return jumlah_hari_lembur;
    }
     
    //Method over loading
    public void setInfo(int Gaji_pokok){
        gaji_pokok = Gaji_pokok;
        total_gaji = (int) (Gaji_pokok + (Gaji_pokok * jumlah_hari_lembur * 0.01));
    }

    //Method tampil
    public void tampil()
    {
        System.out.println("NIP Pegawai                 : " + getNip());
        System.out.println("Nama Pegawai                : " + getNama());
        System.out.println("Alamat Pegawai              : " + getAlamat());
        System.out.println("Jumlah Hari Lembur Pegawai  : " + getJumlah_hari_lembur() + " Hari");
        System.out.println("Gaji Pokok Pegawai          : Rp" + gaji_pokok);
        System.out.println("Total Gaji Pegawai          : Rp" + total_gaji);
    }

}