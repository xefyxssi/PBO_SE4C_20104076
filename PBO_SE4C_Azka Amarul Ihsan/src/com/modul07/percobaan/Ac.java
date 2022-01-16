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
public class Ac extends Elektronik {
  public Ac(){
    }

    public Ac(String name){
        super(name);
    }

  @Override
    public void onActivate(){
        System.out.println(this.getName() + " starts cooling the room!");
    }

  @Override
    public void onDeactivate(){
        System.out.println(this.getName() + " stop cooling the room!");
    }
}

