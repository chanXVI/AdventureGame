package com.Group3.ZombieBytes.JsonParser;

import com.Group3.ZombieBytes.Game.Game;
import com.Group3.ZombieBytes.Game.Location;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LocationParser {
    public static void run() {
//     created an arraylist to store my location objects
        HashMap<String, Location> gameLocation = new HashMap<String, Location>();

        // this class helps us parse the json file
        JSONParser jsonparser = new JSONParser();

        // this class helps us read the json file for location
        {
            try {
                FileReader locationReader = new FileReader("src/main/java/com/Group3/ZombieBytes/JSONfiles/Location.json");
                Object locationObject = jsonparser.parse(locationReader);
                JSONObject locations = (JSONObject) locationObject;

                // Location is a json array of objects
                JSONArray locationArray = (JSONArray) locations.get("Location");

                for (int i = 0; i < locationArray.size(); i++) {
                    JSONObject location = (JSONObject) locationArray.get(i);
                    String name = (String) location.get("name");
//            String item =  (String) location.get("Item");
                    String description = (String) location.get("Description");
                    gameLocation.put(name, new Location(name, description));
                }
                Game.setGameLocation(gameLocation);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}