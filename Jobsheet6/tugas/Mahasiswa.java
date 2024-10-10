package Jobsheet6.tugas;

public class Mahasiswa extends Universitas{
    public String nim;

    public Mahasiswa(){
        System.out.println("Objek Mahasiswa dibuat");
    }

    public Mahasiswa(String nama, String jenisKelamin, int umur, String nim){
        super(nama, jenisKelamin, umur);
        this.nim = nim;
    }

    public String getInfoMhs(){
        return "NIM : " + this.nim + "\n";
    }

    public String getAllMhs(){
        String info = super.getInfo();
        info += this.getInfoMhs();

        return info;
    }
}