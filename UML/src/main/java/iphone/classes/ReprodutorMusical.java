package main.java.iphone.classes;

import main.java.iphone.interfaces.Reproduzivel;

public class ReprodutorMusical implements Reproduzivel {

    @Override
    public void playMusic(String track) {
        System.out.println("Playing track: " + track);
    }

    @Override
    public void pause() {
        System.out.println("Music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }
}
