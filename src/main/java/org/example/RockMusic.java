package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private static List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Smells Like Teen Spirit");
        songs.add("Another brick in the wall");
    }

    @Override
    public String getSong() {
        Random random = new Random();

        int randomItem = random.nextInt(songs.size());
        String randomSong = songs.get(randomItem);

        return randomSong;
    }
}
