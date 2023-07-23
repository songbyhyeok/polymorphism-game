package Overwatch;

public class Mccree extends Player{
    @Override
    public int attack() {
        System.out.println("평타치기");
        return super.attack();
    }

    @Override
    public int eattack() {
        System.out.println("자탄수류탄");
        return super.eattack();
    }

    public void gurugi(){
        System.out.println("구르기!");
    }
}
