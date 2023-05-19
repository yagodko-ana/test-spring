package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    /**
     * Наиль использовал рандом здесь, так как возвращал не getSong, а getSongs (список песен)
     * и здесь уже доставал рандомную песню из спика
     * FYI важно было при этом поменять тип возвращемого значения и в интерфейсе Music на список
     * */
    public void playMusic(Genre genre) {
        if (genre == Genre.CLASSICAL)
            System.out.println(music2.getSong());
        else if (genre == Genre.ROCK)
             System.out.println(music1.getSong());
        else
             System.out.println("-");
    }
}