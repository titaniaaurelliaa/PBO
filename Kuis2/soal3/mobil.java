package Kuis2.soal3;

public class mobil extends kendaraan{
    int jumlahPintu;

    public mobil(String merk, String model, int jumlahPintu){
        super(merk, model);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void bergerak(){
        System.out.println("Mobil " + merk + " sedang melaju");
    }
}