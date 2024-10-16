package Jobsheet7.tugas;

public class Segitiga {
    //Atribut untuk menyimpan sudut segitiga
    private int sudut;

    //menghitung total sudut dari satu sudut
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    //menghitung total sudut dari dua sudut
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    //menghitung keliling segitiga dengan tiga sisi
    public double keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    //menghitung keliling segitiga dengan dua sisi
    public double keliling(int sisiA, int sisiB) {
        return 2 * (sisiA + sisiB);
    }
}

class Demo {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        //Menghitung total sudut
        int sudutA = 60;
        int sudutB = 70;
        int totalSudut1 = segitiga.totalSudut(sudutA);
        int totalSudut2 = segitiga.totalSudut(sudutA, sudutB);
        System.out.println("Total sudut untuk sudut A : " + totalSudut1);
        System.out.println("Total sudut untuk sudut A dan B : " + totalSudut2);

        //Menghitung keliling
        int sisiA = 5, sisiB = 10, sisiC = 7;
        double keliling1 = segitiga.keliling(sisiA, sisiB, sisiC);
        double keliling2 = segitiga.keliling(sisiA, sisiB);
        System.out.println("Keliling segitiga : " + keliling1);
        System.out.println("Keliling segitiga dua sisi : " + keliling2);
    }
}