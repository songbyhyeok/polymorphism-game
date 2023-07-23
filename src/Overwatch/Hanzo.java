package Overwatch;

public class Hanzo extends Player{

    @Override
    public int attack() {
        System.out.println("폭풍화살");
        return super.attack();
    }

    @Override
    public int eattack() {
        System.out.println("음파화살");
        return super.eattack();
    }

    public void wall(){
        System.out.println("벽타기");
    }
}
