package Kuis2.soal3;

public class kendaraan {
    String merk;
    String model;

    public kendaraan(String merk, String model){
        this.merk = merk;
        this.model= model;
    }

    public void bergerak(){
        System.out.println("kendaraan sedang bergerak");
    }
}