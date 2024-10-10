package Jobsheet4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    public String getNoRekamMedis(){
        return noRekamMedis;
    }

    public void setNoRekamaMedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    public String getInfo(){
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "No Rekam Medis : " + this.noRekamMedis + "\n";

        if (!riwayatKonsultasi.isEmpty()){
            info += "Riwayat Konsultasai : \n";

            for (Konsultasi konsultasi : riwayatKonsultasi){
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }
        
        info += "\n";

        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat){
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}