package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // создание связи вручную
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // создание связи через spring Dependency injection
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
