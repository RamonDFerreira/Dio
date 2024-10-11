package com.ramon;
public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 2.50;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        super.sacar(valorComTaxa);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
