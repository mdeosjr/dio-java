package org.example;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //Navegador na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}