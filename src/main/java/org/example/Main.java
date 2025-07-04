package org.example;

import org.example.aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando funcionalidades de musica do iPhone
        iphone.tocarMusica("Shape of You");
        iphone.pausarMusica();
        iphone.proximaMusica();
        iphone.musicaAnterior();
        iphone.selecionarMusica("Blinding Lights");

        System.out.println("======================================================");
        // Testando funcionalidades de telefone do iPhone
        iphone.ligar("123-456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("======================================================");
        // Testando funcionalidades de navegador do iPhone
        iphone.acessarPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Exibindo mensagem de finalização
        System.out.println("Todas as funcionalidades do iPhone foram testadas com sucesso!");

    }
}
