package Kuis2.soal3;
import java.util.ArrayList;
import java.util.List;

import Jobsheet4.tugas.Mobil;

public class kendaraanDemo {
    public static void main(String[] args) {
        List<kendaraan>
        kendaraanList = new ArrayList<>();
        kendaraanList.add(new mobil("Toyota", "Innova", 4));
        kendaraanList.add(new motor("Honda", "Beat", "Matic"));
        kendaraanList.add(new truk("Hino", "Dutro", 10));

        for (kendaraan kendaraan : kendaraanList) {
            bergerakSemuaKendaraan(kendaraan);
        }

        kendaraan kendaraan = kendaraanList.get(0);
        if (kendaraan instanceof mobil) {
            mobil mobil = (mobil) kendaraan;
            System.out.println("Jumlah pintu mobil : " + mobil.jumlahPintu);
        }
    }

    public static void bergerakSemuaKendaraan(kendaraan kendaraan) {
        kendaraan.bergerak();
    }
}