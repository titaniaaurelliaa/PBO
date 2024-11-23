package Kuis2.soal1;

public class Monster extends DamageableObject{
    private int ThreatLevel;
    private String Color;

    public Monster(String name, int PosX, int PosY, int MaxHealth, int ThreatLevel, String Color){
        super(name, PosX, PosY, MaxHealth);
        this.ThreatLevel = ThreatLevel;
        this.Color = Color;
    }

    @Override
    public void OnKilled(){
        System.out.println(name + " was Killed! Threat level : " + ThreatLevel);
        Despawn();
    }

    public void MakeNoise(){
        System.out.println(name + " monster's roar");
    }
}