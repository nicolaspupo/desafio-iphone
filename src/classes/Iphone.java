package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO");

    }

}
