package Kuis2.soal1;

public class Player extends DamageableObject{
    private int Score;
    private int LivesRemaining;

    public Player(String name, int PosX, int PosY, int MaxHealth, int LivesRemaining){
        super(name, PosX, PosY, MaxHealth);
        this.Score = 0;
        this.LivesRemaining = LivesRemaining;
    }

    @Override
    public void OnKilled(){
        LivesRemaining--;
        System.out.println(name + " has died! Lives Remaining : " + LivesRemaining);
        if (LivesRemaining > 0) {
            Health = MaxHealth;
            System.out.println(name + " revived");
        } else {
            Despawn();
        }
    }
}