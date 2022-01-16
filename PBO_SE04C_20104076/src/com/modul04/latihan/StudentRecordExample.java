/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul04.latihan;

/**
 *
 * @author Windows 10
 */
public class StudentRecordExample {

    public static void main(String[] args) {
        StudentRecord Wahyu = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama = new StudentRecord();
        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");
        System.out.println(Wahyu.getName());
        System.out.println("Hitung=" + StudentRecord.getStudentCount()
        );
    }

}
