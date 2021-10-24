/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modul03.tugas;

/**
 *
 * @author Windows 10
 */
public class Tabungan {

    int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int berhitung) {
        saldo = berhitung + saldo;
    }

    public boolean ambilUang(int berhitung) {
        if (berhitung < this.getSaldo()) {
            this.setSaldo(this.getSaldo()
                    - berhitung);
            return true;
        } else {
            return false;
        }
    }
}
