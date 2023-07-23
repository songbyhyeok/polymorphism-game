package Overwatch;

public class Genji extends Player{

    @Override
    public int attack() {

        System.out.println("튕겨내기");


        return super.attack();
    }

    @Override
    public int eattack() {
        System.out.println("질풍참");

        return super.eattack();
    }

    public void doublejump(){
        System.out.println("더블점프하기");
    }
}
