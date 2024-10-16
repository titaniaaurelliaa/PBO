package Jobsheet7.tugas;

public class Manusia {
    //method untuk bernapas
    public void bernapas() {
        System.out.println("Manusia bernapas");
    }

    //method untuk makan
    public void makan() {
        System.out.println("Manusia makan");
    }
}

class Dosen extends Manusia {
    //Mengoverride method makan
    @Override
    public void makan() {
        System.out.println("Dosen makan");
    }

    //method tambahan untuk dosen
    public void lembur() {
        System.out.println("Dosen lembur");
    }
}

class Mahasiswa extends Manusia {
    //Mengoverride method makan
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan");
    }

    //method tambahan untuk mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}

 class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen();
        Manusia manusia2 = new Mahasiswa();

        //Memanggil method bernapas dari kelas induk
        manusia1.bernapas();
        manusia2.bernapas();

        //Memanggil method makan, akan menggunakan method yang di-overriding
        manusia1.makan();
        manusia2.makan();

        //Menggunakan method spesifik untuk Dosen dan Mahasiswa
        Dosen dosen = (Dosen) manusia1;
        dosen.lembur();

        Mahasiswa mahasiswa = (Mahasiswa) manusia2;
        mahasiswa.tidur();
    }
}