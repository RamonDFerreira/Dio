package com.ramon;
public class Main {

    public static void main(String[] args) {
        Cliente ramon = new Cliente("Ramon", "123.456.789-00", "Rua das Flores, 123");
        
        Conta cc = new ContaCorrente(ramon);
        Conta poupanca = new ContaPoupanca(ramon);

        cc.depositar(200);
        cc.sacar(50);
        cc.transferir(100, poupanca);
        cc.sacar(50);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
