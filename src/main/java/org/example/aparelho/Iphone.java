package org.example.aparelho;

import org.example.funcionalidades.AparelhoTelefonico;
import org.example.funcionalidades.NavegadorInternet;
import org.example.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    public void proximaMusica() {
        System.out.println("Próxima música.");
    }

    public void musicaAnterior() {
        System.out.println("Música anterior.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void acessarPagina(String url) {
        System.out.println("Acessando página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
