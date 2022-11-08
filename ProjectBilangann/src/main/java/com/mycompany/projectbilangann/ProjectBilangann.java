/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbilangann;

/**
 *
 * @author Bebby Ka'afiyan Farhan
 * NIM : 21103064
 */
public class ProjectBilangann {

    public static void main(String[] args) {
       int x,y;
        Bilangan bil=new Bilangan (10,20);
        
        //inisialisasi x dan y
        x=15;
        y=30;
        System.out.println("Nilai x dan y sebelum passed by value");
        System.out.println("Nilai x : "+x);
        System.out.println("Nilai y : "+y);
        bil.operasi_pass_by_value(x, y); //passed by value
        System.out.println("Nilai x dan y setelah passed by value");
        System.out.println("Nilai x : "+x);
        System.out.println("Nilai y : "+y);
        System.out.println("\nNilai bil.a dan bil.b sebelum passed by reference");
        bil.tampil();
        bil.operasi_pass_by_reference(bil); //passed by reference
        System.out.println("Nilai bil.a dan bil.b setelah passed by reference");
        bil.tampil();
    }
}