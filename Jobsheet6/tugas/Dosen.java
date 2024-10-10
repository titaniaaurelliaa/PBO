package Jobsheet6.tugas;

public class Dosen  extends Universitas{
    public String nidn;

    public Dosen(){
        System.out.println("Objek Dosen dibuat");
    }

    public Dosen(String nama, String jenisKelamin, int umur, String nidn){
        super(nama, jenisKelamin, umur);
        this.nidn = nidn;
    }

    public String getInfoDsn(){
        return "NIDN : " + this.nidn + "\n";
    }

    public String getAllDsn(){
        String info = super.getInfo();
        info += this.getInfoDsn();

        return info;
    }
}