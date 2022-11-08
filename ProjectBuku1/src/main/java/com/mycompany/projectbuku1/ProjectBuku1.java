/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbuku1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bebby Ka'afiyan Farhan
 * NIM : 21103064
 */
public class ProjectBuku1 {

    public static void main(String[] args) {
          Buku novel,fiksi;
          novel=new Buku();
          fiksi=new Buku();
          System.out.println("");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          try
     {
          System.out.print("Masukkan Judul Buku: "); 
          novel.setJudul(br.readLine () .toString());
          System.out.print("Masukkan Pengarang:");
          novel.setPengarang(br.readLine () .toString());
          novel.setInfo(0.2f,45000);
          System.out.print("Masukkan Jumlah Halaman: ");
          novel.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
          novel.cetak();
          System.out.println();
          System.out.print("Masukkan Judul Buku: ");
          fiksi.setJudul(br.readLine () .toString());
          System.out.print("Masukkan Pengarang: ");
          fiksi.setPengarang(br.readLine () .toString());
          fiksi.setInfo(79000);
          System.out.print("Masukkan Jumlah Halaman: ");
          fiksi.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
          fiksi.cetak();
    }
    catch(Exception ex)
    {
        System.out.println(ex);
    }
    }
}
