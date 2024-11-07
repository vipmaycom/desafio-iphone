package Sistema;

import Sistema.Iphone.navegador.navegarInternet;
import Sistema.Iphone.Reprodutor.ReprodutorMusical;
import Sistema.Iphone.Aparelho.AparelhoTelefônico;

public class iphone implements AparelhoTelefônico, navegarInternet, ReprodutorMusical{

    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }  

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba!");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página!");
    }

    public void Ligarocelular() {
        System.out.println("Ligando o celular!");
    }

    public void desligar() {
        System.out.println("Desligando o celular!");
    }
}