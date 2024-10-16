package Jobsheet7;

public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }

    //latihan 1
    // void perkalian (int a, int b, int c){
    //     System.out.println(a * b * c);
    // }

    //latihan 2
    void perkalian (double a, double b){
        System.out.println(a * b);
    }
    
    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();

        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}