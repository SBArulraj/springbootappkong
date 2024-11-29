package com.example.SpringBootKong_StageII.deloitte;

import org.json.JSONObject;

import java.util.Map;

public class JsonTest {
    public static void main(String args[]) {
        JsonTest jsonTest = new JsonTest();
        jsonTest.jsonTest();
    }

    public void jsonTest() {
        String jsonString = "{\"name\": \"John Doe\", \"age\": 30, \"city\": \"New York\"}";

        // Parse JSON string into JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Get specific values
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String city = jsonObject.getString("city");

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);


        System.out.println("jsonObject :"+jsonObject);
        Map map = (Map)jsonObject.toMap();
        System.out.println("MAP :"+map);
        System.out.println("MAP_name :"+map.getOrDefault("name","Arulraj"));
    }
}
