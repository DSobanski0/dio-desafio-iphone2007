import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.Phone;
import iphone.Iphone;
import navegadorInternet.Safari;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = new Phone();
        NavegadorInternet navegadorInternet = new Safari();
        ReprodutorMusical reprodutorMusical = iphone;

        aparelhoTelefonico.atender();
        navegadorInternet.exibirPagina();
        reprodutorMusical.tocar();
    }
}