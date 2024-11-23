package Kuis2.soal1;

public abstract class DamageableObject extends GameObject{
    public int MaxHealth;
    protected int Health;

    public DamageableObject(String name, int PosX, int PosY, int MaxHealth){
        super(name, PosX, PosY);
        this.MaxHealth = MaxHealth;
        this.Health = Health;
    }

    public boolean isDead(){
        return Health <= 0;
    }

    public void TakeDamage(int damage){
        Health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining Health: " + Health);
        if (isDead()) {
            OnKilled();
        }
    }

    public abstract void OnKilled();
}