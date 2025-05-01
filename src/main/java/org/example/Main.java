package org.example;

public class Main {
    public static void main(String[] args) {

        iPhone meuIphone = new iPhone();

        // Testando o reprodutor musical
        System.out.println("=== Reprodutor Musical ===");
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o aparelho telefônico
        System.out.println("\n=== Aparelho Telefônico ===");
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o navegador de internet
        System.out.println("\n=== Navegador de Internet ===");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }

}