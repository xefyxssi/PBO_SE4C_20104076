/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul07.latihan;

/**
 *
 * @author Windows 10
 */
public class Bunga {

    public void duri() {
        System.out.println("Bunga Berduri");
    }

    public void obat() {
        System.out.println("Tanaman Obat Bunga");
    }
}

//membuat subclass
class Akasia extends Bunga {

    @Override
    public void duri() {
        super.duri();
        System.out.println("Akasia bunga berduri");
    }
}

//membuat subclass
class Matahari extends Bunga {

    @Override
    public void obat() {
        super.obat();
        System.out.println("Matahari tanaman obat bunga");
    }
}

//membuat class main
class Main {

    public static void main(String[] args) {
        Akasia akasia = new Akasia();
        Bunga Matahari = new Matahari();

        akasia.duri();
        Matahari.obat();
    }
}
