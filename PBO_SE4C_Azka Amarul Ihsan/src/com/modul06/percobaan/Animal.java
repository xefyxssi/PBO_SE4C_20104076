/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul06.percobaan;

/**
 *
 * @author Windows 10
 */
public class Animal {

    public String name = "unnamed Animal";
    public int age = 0;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println(this.name + "walks!");
        System.out.println();
    }
}
