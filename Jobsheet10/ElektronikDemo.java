package Jobsheet10;

public class ElektronikDemo {
    public static void main(String[] args) {
        Kipas kipas1 = new Kipas("Dinding", 300000, "Putih", "Sekai");
        System.out.println(kipas1.getInfo());
        // System.out.println("Merk Kipas : " + kipas1.getMerk());
        // System.out.println("Jenis Kipas : " + kipas1.getJenis());
        // System.out.println("Harga : " + kipas1.getHarga());

        TV tv1 = new TV("LED", 10, 1000000, "hitam", "LG");
        // System.out.println("\nMerk TV : " + tv1.getMerk());
        // System.out.println("Jenis Layar : " + tv1.getjenisLayar());
        System.out.println(tv1.getInfo());
        tv1.naikkanVolume(5);
        System.out.println("Volume setelah dinaikkan : " + tv1.getVolume());
        //System.out.println("Harga : " + tv1.getHarga());

        Kulkas kulkas = new Kulkas(4, 3000000, "Silver", "Samsung");
        System.out.println(kulkas.getInfo());
        // System.out.println("\nMerk Kulkas : " + kulkas.getMerk());
        // System.out.println("Warna : " + kulkas.getWarna());
        // System.out.println("Harga : " + kulkas.getHarga());

        SmartFridge smartFridge = new SmartFridge(10, 2, 3500000, "Hitam", "Panasonic");
        // System.out.println("\nMerk Smart Fridge : " + smartFridge.getMerk());
        // System.out.println("Warna : " + smartFridge.getWarna());
        // System.out.println("Harga : " + smartFridge.getHarga());
        System.out.println(smartFridge.getInfo());
        smartFridge.turunkanVolume(5);
        System.out.println("Volume setelah diturunkan : " + smartFridge.getVolume());
    }
}