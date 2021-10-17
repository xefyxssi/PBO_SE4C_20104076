/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.tugas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class BilBulat {

    public static void main(String[] args) {
        Scanner scannn = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukan jumlah test case yang akan dijalankan (1 - 10): ");
        int npercobaan = scannn.nextInt();
        int a, b, c, jumlah;

        for (int i = 1; i <= npercobaan; i++) {
            a = random.nextInt(100);
            b = random.nextInt(100);
            c = random.nextInt(100);

            System.out.print("\n" + String.valueOf(a) + " + " + String.valueOf(b) + " - " + String.valueOf(c) + " = ");

            jumlah = a + b - c;
            System.out.println(jumlah);
        }
    }
}
