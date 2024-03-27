public class CriaLivro {
    public static void main(String[] args) {
        Livro primeiroLivro = new Livro();
        primeiroLivro.paginas = 256;
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.editora.nome = "pedro";
        primeiroLivro.editora.site= "pedro.com";
        primeiroLivro.setTipoCapa(TipoCapa.ESPECIAL);
        primeiroLivro.setValor(100);
        primeiroLivro.autor = "Ana Julia";
        primeiroLivro.exibir();


        Livro segundoLivro = new Livro();
        segundoLivro.valor = 50.0F;
        segundoLivro.titulo = "Macaco bucaneiro";
        segundoLivro.paginas = 93;
        segundoLivro.autor = "Tolkien";
        segundoLivro.editora.nome = "leonardo kenji";
        segundoLivro.editora.site= "kenjismo.net";
        segundoLivro.tipoCapa = TipoCapa.DURA;
        segundoLivro.exibir();
        System.out.println(segundoLivro.getTaxaEnvio());
        System.out.println(segundoLivro.Desconto());
    }
}
}