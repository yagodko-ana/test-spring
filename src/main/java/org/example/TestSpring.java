package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // создание связи через spring Dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer == musicPlayer1;

        System.out.println(comparison);
        System.out.println(musicPlayer);
        System.out.println(musicPlayer1);

        musicPlayer.setVolume(10);
        System.out.println(musicPlayer.getVolume() + " " + musicPlayer1.getVolume());

        musicPlayer.playMusicList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
