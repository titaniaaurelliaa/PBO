package Kuis2.soal3;

public class motor extends kendaraan{
    String jenisMotor;

    public motor(String merk, String model, String jenisMotor){
        super(merk, model);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + jenisMotor + " sedang melaju");
    }
}