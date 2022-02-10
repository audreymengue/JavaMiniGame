package com.company;

public class Player2 extends Player1{

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void hurtByGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor on! Got hit health is reduced by 20. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor on! Got hit health is reduced by 30. New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void hurtByGun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor on! Got hit health is reduced by 40. New health is " + this.health);
        }
        if (!armour) {
            this.health -= 30;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor on! Got hit health is reduced by 30. New health is " + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
