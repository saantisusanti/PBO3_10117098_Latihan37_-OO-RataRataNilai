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
public class NilaiMhs {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double hitungTotal(int parNilaiMhs, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
    }
        return totalNilaiMhs;}

    public double hitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
}
