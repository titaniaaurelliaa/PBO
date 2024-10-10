import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int angka1 = sc.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int angka2 = sc.nextInt();

        System.out.print("Masukkan operator  +, -, *, / : ");
        char operator = sc.next().charAt(0);

        int hasil = 0;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/': 
                if (angka2 == 0) {
                    System.out.println("Tidak bisa dibagi 0");
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        System.out.println("Hasil: " + hasil);
    }
}