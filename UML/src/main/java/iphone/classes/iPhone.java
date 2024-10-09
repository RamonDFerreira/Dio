package main.java.iphone.classes;

import main.java.iphone.interfaces.Navegavel;
import main.java.iphone.interfaces.Reproduzivel;
import main.java.iphone.interfaces.Telefonavel;

public class iPhone implements Navegavel, Reproduzivel, Telefonavel {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    // Métodos de Reproduzivel
    @Override
    public void playMusic(String track) {
        reprodutorMusical.playMusic(track);
    }

    @Override
    public void pause() {
        reprodutorMusical.pause();
    }

    @Override
    public void stop() {
        reprodutorMusical.stop();
    }

    // Métodos de Telefonavel
    @Override
    public void makeCall(String number) {
        aparelhoTelefonico.makeCall(number);
    }

    @Override
    public void receiveCall(String caller) {
        aparelhoTelefonico.receiveCall(caller);
    }

    // Métodos de Navegavel
    @Override
    public void openBrowser() {
        navegadorInternet.openBrowser();
    }

    @Override
    public void navigateTo(String url) {
        navegadorInternet.navigateTo(url);
    }
}
