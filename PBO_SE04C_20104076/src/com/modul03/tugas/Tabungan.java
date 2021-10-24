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

    public void simpanUang(int jumlah) {
        saldo
                = jumlah + saldo;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah < this.getSaldo()) {
            this.setSaldo(this.getSaldo()
                    - jumlah);
            return true;
        } else {
            return false;
        }

    }
}
