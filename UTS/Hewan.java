package UTS;

//super class hewan
public class Hewan {
    String nama;
    String warna;
    int umur;

    //constructor untuk inisialisasi atribut
    public Hewan(String nama, int umur, String warna){
        this.nama = nama;
        this.umur = umur;
        this.warna = warna;
    }

    //method makan untuk hewan
    public void makan(){
        System.out.println(nama + " sedang makan");
    }

    //method menampilkan info hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama + ", Umur : " + umur + ", Warna : " + warna);
    }
}

//child class dari hewan (mamalia)
class Mamalia extends Hewan {
    boolean berdarahPanas;

    //constructor untuk inisialisasi atribut mamalia dan memanggil constructor hewan
    public Mamalia(String nama, int umur, String warna, boolean berdarahPanas) {
        super(nama, umur, warna); //memanggil konstruktor superclass (Hewan)
        this.berdarahPanas = berdarahPanas;
    }

    //method mamalia
    public void melahirkan() {
        System.out.println(nama + " sedang melahirkan.");
    }

    public void tampilkanInfoMamalia() {
        tampilkanInfo(); //method dari Hewan
        System.out.println("Berdarah Panas : " + (berdarahPanas ? "Ya" : "Tidak"));
    }
}

//child class dari mamalia (multilevel inheritance)
class Kucing extends Mamalia {
    String ras;
    
    //constructor untuk inisialisasi atribut kucing dan memanggil constructor mamalia
    public Kucing(String nama, int umur, String warna, boolean berdarahPanas, String ras) {
        super(nama, umur, warna, berdarahPanas); //memanggil konstruktor superclass (Mamalia)
        this.ras = ras;
    }

    //method mamalia
    public void mengeong() {
        System.out.println(nama + " sedang mengeong.");
    }

    public void tampilkanInfoKucing() {
        tampilkanInfoMamalia(); //method dari Mamalia
        System.out.println("Ras : " + ras);
    }
}

//class main
class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Cio", 1, "Putih", false, "Ragdoll");

        kucing.makan();
        kucing.melahirkan();
        kucing.mengeong();
        kucing.tampilkanInfoKucing();
    }
}