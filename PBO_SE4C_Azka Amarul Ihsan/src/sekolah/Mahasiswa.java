/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sekolah;

/**
 *
 * @author Windows 10
 */
public class Mahasiswa {

    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Mahasiswa(int kode,
            String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahasiswa = mhs;
    }
}

