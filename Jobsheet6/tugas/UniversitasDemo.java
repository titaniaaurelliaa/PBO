package Jobsheet6.tugas;

public class UniversitasDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Titan", "Perempuan", 19, "2341");
        System.out.println(dosen1.getAllDsn());

        Mahasiswa mahasiswa1 = new Mahasiswa("Aurellia", "Perempuan", 19, "760112");
        System.out.println(mahasiswa1.getAllMhs());
    }
}