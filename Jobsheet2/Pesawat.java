public class Pesawat {
    public String nama;
    public int kapasitasPenumpang;
    public int kecepatan;
    public int maxKecepatan;

    public int tambahKecepatan(int increment){
        kecepatan += increment;
        return kecepatan;
    }

    public int kurangKecepatan(int decrement){
        kecepatan -= decrement;
        return kecepatan;
    }

    public void displayInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Kapasitas Penumpang : "+ kapasitasPenumpang);
        System.out.println("Max Kecepatan : " + maxKecepatan);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("--------------------");
        
    }
}