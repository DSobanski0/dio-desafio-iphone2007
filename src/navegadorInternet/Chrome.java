package navegadorInternet;

public class Chrome implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA VIA CHROME");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA VIA CHROME");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA VIA CHROME");
    }
}
