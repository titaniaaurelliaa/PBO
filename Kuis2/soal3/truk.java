package Kuis2.soal3;

public class truk extends kendaraan{
    int kapasitasMuatan;

    public truk(String merk, String model, int kapasitasMuatan){
        super(merk, model);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void bergerak() {
        System.out.println("Truk sedang mengangkut barang");
    }
}