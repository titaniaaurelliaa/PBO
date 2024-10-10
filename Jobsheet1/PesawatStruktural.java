/**
 * PesawatStruktural
 */
public class PesawatStruktural {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, nama2, nama3, nama4, nama5, nama6, nama7, nama8, nama9, nama10;
        int kec, kec2, kec3, kec4, kec5, kec6, kec7, kec8, kec9, kec10,
        maxKec, maxKec2, maxKec3, maxKec4, maxKec5, maxKec6, maxKec7, maxKec8, maxKec9, maxKec10;

        //inisialisasi variabel
        nama = "Boeing 747-8";
        kec = 700;
        maxKec = 1041;

        nama2 = "Airbus A380";
        kec2 = 600;
        maxKec2 = 1041;

        nama3 = "Boeing 787 Dreamliner";
        kec3 = 800;
        maxKec3 = 1041;

        nama4 = "Airbus A350";
        kec4 = 900;
        maxKec4 = 1076;

        nama5 = "Lockheed Martin F-22 Raptor";
        kec5 = 1000;
        maxKec5 = 2756;

        nama6 = "Boeing F-15 Eagle";
        kec6 = 2000;
        maxKec6 = 3063;

        nama7 = "Dassault Rafale";
        kec7 = 1500;
        maxKec7 = 2190;

        nama8 = "Eurofighter Typhoon";
        kec8 = 2100;
        maxKec8 = 2450;

        nama9 = "Pilatus PC-21";
        kec9 = 780;
        maxKec9 = 1001;

        nama10 = "Aero L-39 Albatros";
        kec10 = 650;
        maxKec10 = 1001;

        kec = tambahKecepatan(kec, 200);
        kec2 = tambahKecepatan(kec2, 300);
        kec3 = tambahKecepatan(kec3, 100);
        kec4 = tambahKecepatan(kec4, 50);
        kec5 = tambahKecepatan(kec5, 70);
        kec6 = kurangKecepatan(kec6, 50);
        kec7 = kurangKecepatan(kec7, 500);
        kec8 = kurangKecepatan(kec8, 100);
        kec9 = kurangKecepatan(kec9, 80);
        kec10 = kurangKecepatan(kec10, 50);

        System.out.println("Nama : " + nama);
        System.out.println("Kecepatan : " + kec);
        System.out.println("Max Kecepatan : " + maxKec);

        System.out.println("\nNama : " + nama2);
        System.out.println("Kecepatan : " + kec2);
        System.out.println("Max Kecepatan : " + maxKec2);

        System.out.println("\nNama : " + nama3);
        System.out.println("Kecepatan : " + kec3);
        System.out.println("Max Kecepatan : " + maxKec3);

        System.out.println("\nNama : " + nama4);
        System.out.println("Kecepatan : " + kec4);
        System.out.println("Max Kecepatan : " + maxKec4);

        System.out.println("\nNama : " + nama5);
        System.out.println("Kecepatan : " + kec5);
        System.out.println("Max Kecepatan : " + maxKec5);

        System.out.println("\nNama : " + nama6);
        System.out.println("Kecepatan : " + kec6);
        System.out.println("Max Kecepatan : " + maxKec6);

        System.out.println("\nNama : " + nama7);
        System.out.println("Kecepatan : " + kec7);
        System.out.println("Max Kecepatan : " + maxKec7);

        System.out.println("\nNama : " + nama8);
        System.out.println("Kecepatan : " + kec8);
        System.out.println("Max Kecepatan : " + maxKec8);

        System.out.println("\nNama : " + nama9);
        System.out.println("Kecepatan : " + kec9);
        System.out.println("Max Kecepatan : " + maxKec9);

        System.out.println("\nNama : " + nama10);
        System.out.println("Kecepatan : " + kec10);
        System.out.println("Max Kecepatan : " + maxKec10);
    }

    public static int tambahKecepatan(int kec, int increment){
        kec += increment;

        return kec;
    }

    public static int kurangKecepatan(int kec, int decrement){
        kec -= decrement;

        return kec;
    }
}