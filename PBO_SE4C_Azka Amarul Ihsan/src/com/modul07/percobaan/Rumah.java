/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul07.percobaan;

/**
 *
 * @author Windows 10
 */
public class Rumah {

    public static void main(String[] args) {
        Tv tv = new Tv("TV");
        Ac ac = new Ac("AC");
        Elektronik lamp = new Elektronik("Lamp");
        Elektronik device = new Elektronik();

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();
    }
}
