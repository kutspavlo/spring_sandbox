package spring.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("rockMusic", RockMusic.class);
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        MusicPlayer musicPlayer =  new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        MusicPlayer classicalMusicPlayerPlayer = new MusicPlayer(music2);
//        classicalMusicPlayerPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//
//        context.close();
    }
}
