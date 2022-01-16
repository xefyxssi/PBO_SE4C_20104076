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
public class Kelas {

    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
