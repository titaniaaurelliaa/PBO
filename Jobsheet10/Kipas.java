package Jobsheet10;

public class Kipas extends AlatElektronik{
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk){
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis(){
        return jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getInfo(){
        return "Merk Kipas : " + getMerk() + ", Jenis kipas : " + getJenis() + ", Harga : " + getHarga();
    }
}