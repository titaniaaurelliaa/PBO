package Jobsheet6.tugas;

public class Universitas {
    public String nama;
    public String jenisKelamin;
    public int umur;

    public Universitas(){
        System.out.println("Objek univ dibuat");
    }

    public Universitas(String nama, String jenisKelamin, int umur){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getInfo(){
        String info = "";
        info += "Nama : " + nama + "\n";
        info += "Jenis Kelamin : " + jenisKelamin + "\n";
        info += "Umur : " + umur + "\n";

        return info;
    }
}