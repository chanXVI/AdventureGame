package com.SemiFinalProject.Group3.ZombieBytes.Items;

public class Food implements Items{
    // properties
    String name;

    public Food(String food) {
    }

    // methods
    @Override
    public void use() {
        // restore health
        Character.health = Character.health + 5;
    }
}
