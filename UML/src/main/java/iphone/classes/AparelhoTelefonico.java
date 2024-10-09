package main.java.iphone.classes;

import main.java.iphone.interfaces.Telefonavel;

public class AparelhoTelefonico implements Telefonavel {

    @Override
    public void makeCall(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void receiveCall(String caller) {
        System.out.println("Receiving call from: " + caller);
    }
}
