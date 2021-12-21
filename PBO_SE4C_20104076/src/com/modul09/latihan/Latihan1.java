/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul09.latihan;

import java.io.FileNotFoundException;

/**
 *
 * @author Windows 10
 */
public class Latihan1 {

    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File Tidak Ada!");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
