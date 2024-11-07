import Sistema.iphone;

public class SistemaOperacional {
    public static void main(String[] args) {
        iphone Iphone = new iphone();

        Iphone.Ligarocelular();

        Iphone.ligar("230912390139");
        Iphone.atender();
        Iphone.iniciarCorreioVoz();

        Iphone.selecionarMusica("David Kushner - Daylight");
        Iphone.tocar();
        Iphone.pausar();

        Iphone.adicionarNovaAba();
        Iphone.exibirPagina("https://www.nyan.cat");
        Iphone.atualizarPagina();

        Iphone.desligar();
    }
}
