package Kuis2.soal1;

public class GameObject {
    String name;
    int PosX;
    int PosY;

    public GameObject(String name, int PosX, int PosY){
        this.name = name;
        this.PosX = PosX;
        this.PosY = PosY;
    }

    public void Despawn(){
        //implementasi untuk menghapus object dari game
        System.out.println(name + " has been despawned");
    }
}