// Enemy = parent class

package com.company;

public class Enemy {

    private int health;         // Enemy attributes

    public void Talk(){     // ability to talk
        System.out.println("I am an enemy. You better run!");
    }

    // Set getters and setters to give the user control over what we want them to be able to set and get.
    public void getHealth(){
        System.out.println(health);
    }

    public void setHealth(int x){
        health = x;
    }
}
