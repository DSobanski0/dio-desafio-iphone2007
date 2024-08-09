package navegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA VIA SAFARI");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA SAFARI");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA VIA SAFARI");
    }
}
