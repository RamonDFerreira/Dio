package main.java.iphone.classes;

import main.java.iphone.interfaces.Navegavel;

public class NavegadorInternet implements Navegavel {

    @Override
    public void openBrowser() {
        System.out.println("Opening browser...");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to: " + url);
    }
}
