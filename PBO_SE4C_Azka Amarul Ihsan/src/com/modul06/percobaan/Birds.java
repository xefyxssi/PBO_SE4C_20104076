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
public class Birds extends Animal {

    public Birds() {
    }

    public Birds(String name) {
        super(name);
    }

    public Birds(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(this.name + "flies!");
        System.out.println();
    }
}
