package main.java.iphone;

import main.java.iphone.classes.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        
        // Testando funcionalidades de Reprodutor Musical
        myiPhone.playMusic("Song A");
        myiPhone.pause();
        myiPhone.stop();
        
        // Testando funcionalidades de Aparelho Telefônico
        myiPhone.makeCall("123-456-7890");
        myiPhone.receiveCall("John Doe");
        
        // Testando funcionalidades de Navegador
        myiPhone.openBrowser();
        myiPhone.navigateTo("https://www.apple.com");
    }
}