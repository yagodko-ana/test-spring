package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    private static List<String> songs = new ArrayList<>();

    {
        songs.add("Nutcracker");
        songs.add("Hun Rhapsody");
        songs.add("Beethoven's 5 Secrets");

    }

    @Override
    public String getSong() {
        Random random = new Random();

        int randomItem = random.nextInt(songs.size());
        String randomSong = songs.get(randomItem);

        return randomSong;
    }
}
