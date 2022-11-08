/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectdatapegawaii;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author YUNITA
 */
public class ProjectDataPegawaii {

    public static void main(String[] args) {
        
        DataPegawai kantorBebby = new DataPegawai();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
        try
        {
            System.out.print("Masukkan NIP Pegawai        : "); 
            kantorBebby.setnip(Integer.parseInt(br.readLine().toString()));
            System.out.print("Masukkan Nama Pegawai       : ");
            kantorBebby.setnama(br.readLine().toString());
            System.out.print("Masukkan Alamat Pegawai     : ");
            kantorBebby.setalamat(br.readLine().toString());
            System.out.print("Masukkan Jumlah Hari Lembur : ");
            kantorBebby.setjumlah_hari_lembur(Integer.parseInt(br.readLine().toString()));
            kantorBebby.setInfo(5000000);
            System.out.println("");
            kantorBebby.tampil();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}