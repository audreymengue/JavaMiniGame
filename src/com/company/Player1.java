package com.company;

public class Player1 {

    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health < 0 || health > 100 ) {
            this.health = 100;
        } else this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void heal() {
        if(this.health <= 0) System.out.println("Player dead. No lives available!");
        else {this.health = 100;
            System.out.println("Health is " + this.health);
        }
    }

    public void hurtByGun1() {
        this.health -= 30;
        if (this.health <=0) {
            this.health = 0;
        }
        System.out.println("Gunshot by player 1. Health 30" + ". New life is "+ this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead!");
        }
    }
    public void hurtByGun2() {
        this.health -= 50;
        if (this.health <=0) {
            this.health = 0;
        }
        System.out.println("Gunshot by player 2. Health 50" + ". New life is "+ this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead!");
        }
    }
}
