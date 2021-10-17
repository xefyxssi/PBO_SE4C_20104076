/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.tugas;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class AnakAyam {

    public static void main(String[] args) {
        Scanner scannn = new Scanner(System.in);

        int anakAyam, y;

        System.out.print("Masukan Jumalah Anak Ayam : ");
        anakAyam = scannn.nextInt();
        for (y = anakAyam; y > 1; y--) {
            System.out.print("Anak Ayam Turun " + anakAyam + "\n");
            anakAyam = y - 1;
            System.out.println("Mati 1 Tinggal " + anakAyam);
        }
        System.out.println("Anak Ayam Turun 1 \nMati 1 Tinggal Induknya");
    }
}
