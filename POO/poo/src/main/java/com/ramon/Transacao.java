package com.ramon;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transacao {
    private String tipo;
    private double valor;
}
