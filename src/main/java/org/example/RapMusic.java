package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RapMusic implements Music{
    private static List<String> songs = new ArrayList<>();

    {
        songs.add("Till I die");
        songs.add("LOCO");

    }

    @Override
    public String getSong() {
        Random random = new Random();

        int randomItem = random.nextInt(songs.size());
        String randomSong = songs.get(randomItem);

        return randomSong;
    }
}
