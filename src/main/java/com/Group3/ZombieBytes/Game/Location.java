package com.Group3.ZombieBytes.Game;

import com.Group3.ZombieBytes.lifeforms.Zombie;
import com.Group3.ZombieBytes.Items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Location {
    // properties
    private String name;
    private String description;
    private HashMap<String, String> availableDirection;
    private ArrayList<Item> items;


    private ArrayList<Zombie> zombies;

    // constructor
    public Location(String name, String description,HashMap<String, String> availableDirection ){
        setName(name);
        setDescription(description);
        setAvailableDirection(availableDirection);
    }

    // methods
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public HashMap<String, String> getAvailableDirection() {
        return availableDirection;
    }

    public void setAvailableDirection(HashMap<String, String> availableDirection) {
        this.availableDirection = availableDirection;
    }
    // toString
    public String toString(){
        return description;
    }
}


