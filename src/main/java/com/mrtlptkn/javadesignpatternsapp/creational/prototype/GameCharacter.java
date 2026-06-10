package com.mrtlptkn.javadesignpatternsapp.creational.prototype;

import java.util.List;

public class GameCharacter implements Cloneable {

    private String name;
    private int health;
    private int level;
    private List<String> inventory;


    public GameCharacter(String name, int health, int level, List<String> inventory) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.inventory = inventory;
    }

    public GameCharacter clone(){
        try{

            GameCharacter copyObj = (GameCharacter) super.clone(); // shadow copy primative field kopyalanır.
            copyObj.inventory = List.copyOf(this.inventory); // inventory yeni bir liste ile kopyalanır.

            return copyObj;

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
