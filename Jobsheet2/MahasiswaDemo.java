public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Titania Aurellia";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2C";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Alyssa Tifara";
        m3.alamat = "Sawojajar, Jawa Timur";
        m3.kelas = "2C";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}