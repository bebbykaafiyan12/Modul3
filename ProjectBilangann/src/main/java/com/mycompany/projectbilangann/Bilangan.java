/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbilangann;

/**
 *
 * @author Bebby Ka'afiyan Farhan
 * NIM : 21103064
 */
public class Bilangan 
{
    
  private int a;
    private int b;
    public Bilangan(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void tampil()
    {
        System.out.println("Nilai bil.a : "+a);
        System.out.println("Nilai bil.b : "+b);
    }
    //passed by value dengan parameter tipe data primitif 
    public void operasi_pass_by_value(int x, int y)
    {
        x = x*10;
        y = y+15;
    }
    //passed by reference dengan parameter tipe data class
    public void operasi_pass_by_reference(Bilangan bil)
    {
        bil.a = bil.a*10;
        bil.b = bil.b+15;
    }   
}
