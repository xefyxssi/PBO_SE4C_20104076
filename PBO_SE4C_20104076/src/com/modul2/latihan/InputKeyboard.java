/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul2.latihan;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class InputKeyboard {

    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);

        int var_a;
        int var_b;
        System.out.println("MASUKAN NILAI VAR_A = ");
        var_a = masukan.nextInt();

        System.out.println("MASUKAN NILAI VAR_B = ");
        var_b = masukan.nextInt();

        System.out.println("=== VARIABEL YANG TERDAPAT DALAM PROGRAM === ");
        System.out.println("VAR_A = " + var_a);
        System.out.println("VAR_B = " + var_b);

    }
}
