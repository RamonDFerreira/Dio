package com.ramon;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
            return;
        }
        saldo -= valor;
        transacoes.add(new Transacao("Saque", valor));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
            return;
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        transacoes.add(new Transacao("Transferência para conta " + contaDestino.getNumero(), valor));
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
