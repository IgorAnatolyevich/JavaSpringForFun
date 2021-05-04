package org.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compare = musicPlayer1 == musicPlayer2;

        System.out.println(compare);

        System.out.println("1 " + musicPlayer1);
        System.out.println("2 " + musicPlayer2);

        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        musicPlayer1.setVolume(50);

        System.out.println(musicPlayer1.getName());

        System.out.println(musicPlayer2.getVolume());
        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
