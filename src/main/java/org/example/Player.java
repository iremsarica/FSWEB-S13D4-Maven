package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player (String name,int healthPercentage,Weapon weapon){
        this.name=name;
        this.healthPercentage=healthPercentage < 0 ? 0 : Math.min(healthPercentage,100);
        this.weapon=weapon;
    }
    public int healthRemaining(){
        return this.healthPercentage;
    }
    public void loseHealth(int damage){
        this.healthPercentage -= damage;

        if(this.healthPercentage < 0){
            System.out.println(name + " player has been knocked out of game");
            this.healthPercentage=0;
        }
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage = Math.min(this.healthPercentage+healthPotion,100);
    }
}
