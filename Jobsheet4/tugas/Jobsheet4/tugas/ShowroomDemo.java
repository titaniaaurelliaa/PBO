package Jobsheet4.tugas;

import java.time.LocalDate;

public class ShowroomDemo {
    public static void main(String[] args) {
        Karyawan titan = new Karyawan("Titan", "sales");
        Karyawan aurel = new Karyawan("Aurell", "sales");

        Mobil mobil1 = new Mobil("Fortuner", 1000);
        mobil1.tambahJual(LocalDate.of(2024, 9, 19), titan);
        Mobil mobil2 = new Mobil("Innova", 500);
        mobil2.tambahJual(LocalDate.of(2024, 9, 20), titan);
        // System.out.println(mobil1.getInfo());
        titan.tambahPenjualan(mobil1);
        titan.tambahPenjualan(mobil2);
        System.out.println(titan.getInfo());

        System.out.println(aurel.getInfo());

        
        // System.out.println(mobil2.getInfo());

        //System.out.println(titan.getInfo());
        // Karyawan titan = new Karyawan("Titan", "sales");
        // titan.tambahPenjualan(LocalDate.of(2024, 9, 26), mobil2);
        // titan.getInfo();
        // mobil1.getInfo();

        // aurel.getInfo();

        // mobil1.tambahJual(LocalDate.of(2024, 9, 19), titan);
        // System.out.println(mobil1.getInfo());

        // mobil1.tambahJual(LocalDate.of(2024, 9, 19), aurel);
        // System.out.println(mobil1.getInfo());

        // System.out.println(mobil2.getInfo());

    }
}