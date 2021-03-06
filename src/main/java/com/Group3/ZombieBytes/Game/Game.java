package com.Group3.ZombieBytes.Game;
//import com.Group3.ZombieBytes.lifeforms.Character;
//import com.Group3.ZombieBytes.lifeforms.Zombie;

import com.Group3.ZombieBytes.JsonParser.*;
import com.Group3.ZombieBytes.PrintToOutPut.PrintContent;
//import com.Group3.ZombieBytes.lifeforms.Character;
//import com.Group3.ZombieBytes.lifeforms.Zombie;
import com.Group3.ZombieBytes.Items.*;
import com.Group3.ZombieBytes.JsonParser.*;
import com.Group3.ZombieBytes.lifeforms.Character;
import com.Group3.ZombieBytes.lifeforms.Zombie;

import java.util.HashMap;

public class Game {
    // properties
    // set game map
    private static HashMap<String, Location> gameLocation;

    // constructors
    private Game(){

    }
    // methods
        // business methods
    public static void start(){
        runParsers();  // gathers data from json files and installs our classes with its properties
        Character.startGame();

        // game code
//        for (Map.Entry<String, Location> loc : gameLocation.entrySet()) {
//            String key = loc.getKey();
//            Location location = loc.getValue();
//            PrintContent.print("Location Name:" + key);
//            PrintContent.print("Location Items: " + location.getItems());
//            PrintContent.print("Location Zombies: " + location.getZombies());
//            PrintContent.print("");
//        }
    }
    // runs the parsers to fill the game properties
    public static void runParsers(){
        GameTextParser.run();
        LocationParser.run();
        ItemParser.run();
        ZombieParser.run();

//        for(Map.Entry<String, Location> loc : gameLocation.entrySet()) {
//            PrintContent.print("Location: " + loc.getKey());
//            PrintContent.print("Items: " + loc.getValue().getItems());
//            PrintContent.print("Total Items: " + loc.getValue().getItems().size());
//        }
    }
    // setters and getters
    public static HashMap<String, Location> getGameLocation() {
        return gameLocation;
    }

    public static void setGameLocation(HashMap<String, Location> gameLocation) {
        Game.gameLocation = gameLocation;
    }
    // toString
//    public String toString(){
//        return ;
//    }
}

