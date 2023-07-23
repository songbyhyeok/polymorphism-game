package Overwatch;

import java.util.Random;

public class Player implements Overwatch {
    private int hp;
    private int power;
    public int identity;

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int hit() {
        return (int)(Math.random()*30);
    }

    @Override
    public int attack() {
        return power + hit();
    }

    @Override
    public int eattack() {
        return power + hit() + 2;
    }

    public void init(int hp, int power) {
        setHp(hp);
        setPower(power);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
