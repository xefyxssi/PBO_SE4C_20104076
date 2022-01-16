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
public class Elektronik {

    private String name;
    private boolean isActivated = false;

    public Elektronik() {
        this.name = "A device";
        System.out.println(this.getName() + " has been spawned!");
    }

    public Elektronik(String name) {
        this.name = name;
        System.out.println(this.getName() + " has been spawned!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void activate() {
        this.isActivated = true;
        System.out.println(this.getName() + " has been activated!");
        this.onActivate();
    }

    public void deactivate() {
        this.isActivated = false;
        System.out.println(this.getName() + " has been deactivated!");
        this.onDeactivate();
    }

    public void onActivate() {
    }

    public void onDeactivate() {
    }
}


