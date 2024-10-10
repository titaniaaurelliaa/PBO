public class PesawatDemo {
    public static void main(String[] args) {
        Pesawat pesawat1 = new Pesawat();
        pesawat1.nama = "Boeing 747-8";
        pesawat1.kapasitasPenumpang = 200;
        pesawat1.maxKecepatan = 1041;
        pesawat1.kecepatan = 700;

        Pesawat pesawat2 = new Pesawat();
        pesawat2.nama = "Airbus A380";
        pesawat2.kapasitasPenumpang = 250;
        pesawat2.maxKecepatan = 1041;
        pesawat2.kecepatan = 600;

        pesawat1.tambahKecepatan(200);
        pesawat1.displayInfo();
        

        pesawat2.kurangKecepatan(50);
        pesawat2.displayInfo();
    }
}
