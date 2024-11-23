package Kuis2.soal1;

public class GameDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Nana", 0, 0, 100, 4);
        Monster monster1 = new Monster("Balmond", 0, 0, 100, 2, "Red");

        System.out.println("Game Start!");
        monster1.MakeNoise();

        System.out.println("\nBattle :");
        monster1.TakeDamage(60);
        player1.TakeDamage(45);

        monster1.TakeDamage(100);
        player1.TakeDamage(90);
        player1.TakeDamage(60);
    }
}