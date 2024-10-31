package Jobsheet10;

public class Kulkas extends AlatElektronik{
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public void setjumlahPintu(int jumlahPintu){
    this.jumlahPintu = jumlahPintu;
    }

    public String getInfo(){
        return "\nMerk Kulkas : " + getMerk() + ", Warna : " + getWarna() + ", Harga : " + getHarga();
    }
}