package com.ramon;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        contas.forEach(conta -> System.out.println("Conta: " + conta.getNumero() + ", Cliente: " + conta.getCliente().getNome()));
    }
}
