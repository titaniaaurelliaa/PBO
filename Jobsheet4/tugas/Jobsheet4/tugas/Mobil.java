package Jobsheet4.tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mobil {
    private String merk;
    private double harga;
    private ArrayList<Jual> jualMobil;

    public Mobil(String merk, double harga){
        this.merk = merk;
        this.harga = harga;
        this.jualMobil = new ArrayList<Jual>();
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(){
        this.merk = merk;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(){
        this.harga = harga;
    }

    public String getInfo(){
        //return merk + "(" + harga + ")";
        String info = "";
        info += "Merk : " + this.merk + "\n";
        info += "Harga : " + this.harga + "\n";
        if (!jualMobil.isEmpty()){
            info += "Riwayat terjual : \n";

            for (Jual jual : jualMobil){
                info += jual.getInfo(); //
            }
        } else {
            info += "Belum ada riwayat terjual";
        }
        
        info += "\n";

        return info;
    }

    public void tambahJual(LocalDate tanggal, Karyawan sales){
        Jual jual = new Jual();
        jual.setTanggal(tanggal);
        jual.setSales(sales);
        jualMobil.add(jual);
    }
}