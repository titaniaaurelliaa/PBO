package Jobsheet4.tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Karyawan {
    private String nama;
    private String jabatan;
    private ArrayList<Mobil> riwayatPenjualan;

    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.riwayatPenjualan = new ArrayList<Mobil>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getInfo() {
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Jabatan : " + this.jabatan + "\n";

        if (!riwayatPenjualan.isEmpty()) {
            info += "Riwayat Penjualan : \n";

            for (Mobil mobil : riwayatPenjualan) {
                info += mobil.getMerk() + "\n";
            }
        } else {
            info += "Belum ada riwayat penjualan";
        }

        info += "\n";

        return info;
    }

    public void tambahPenjualan(Mobil mobil) {
        riwayatPenjualan.add(mobil);
    }
}