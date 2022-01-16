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
public class StudentRecord {

    private String name;
    //private String address;
    //private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public String getName() {
        return name;
    }

    public void setName(String temp) {
        name = temp;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
