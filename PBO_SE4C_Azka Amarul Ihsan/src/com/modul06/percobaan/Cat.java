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
public class Cat extends Animal {

    public String color = "";

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void walk() {
        System.out.println(this.color + " " + this.name + "walks!");
        System.out.println();
    }
}
