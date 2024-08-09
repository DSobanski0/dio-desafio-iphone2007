package aparelhoTelefonico;

import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("LIGANDO PARA ALGUEM");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO ALGUEM");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
