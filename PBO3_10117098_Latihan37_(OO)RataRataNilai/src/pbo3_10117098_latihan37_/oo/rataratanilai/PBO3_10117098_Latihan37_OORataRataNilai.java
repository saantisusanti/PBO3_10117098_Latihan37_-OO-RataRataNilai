/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan37_.oo.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan rata rata 
 *                     nilai yang di input oleh user, dengan konsep OOP
 */
public class PBO3_10117098_Latihan37_OORataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         NilaiMhs mhs = new NilaiMhs();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.hitungTotal(mhs.nilaiMhs, n);
         mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
    }
    
}
