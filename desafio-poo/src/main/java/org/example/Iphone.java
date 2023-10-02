package org.example;

import org.example.interfaces.AparelhoTelefonico;
import org.example.interfaces.NavegadorNaInternet;
import org.example.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    public void ligar() {
        System.out.println("Ligando de iPhone...");
    }

    public void atender() {
        System.out.println("Atendendo de iPhone...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz de iPhone...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página no navegador de internet de iPhone...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando aba no navegador de internet de iPhone...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador de internet de iPhone...");
    }

    public void tocar() {
        System.out.println("Tocando do reprodutor musical de iPhone...");
    }

    public void pausar() {
        System.out.println("Pausando no reprodutor musical de iPhone...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música no reprodutor musical de iPhone...");
    }
}
