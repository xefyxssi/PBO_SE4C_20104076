/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul09.latihan;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Latihan2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Masukan angka : ");
            int angka = scan.nextInt();
            if (angka > 10) {
                throw new Exception();
            }
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s) {
            System.out.println("Angka lebih dari 10");
        }
        System.out.println("Selesai");
    }
}
