public class TestaReferencias {

    public static void main(String[] args) {
        Livro livroA = new Livro();
        livroA.titulo = "Bloons TD 6";
        System.out.println("Livro A: "+ livroA.titulo);

        Livro livroB = livroA;
        System.out.println("Livro B: "+ livroB.titulo);

        livroB.titulo = "Bloons TD 7";
        System.out.println("Livro B: "+ livroB.titulo);

        System.out.println(livroA);
        System.out.println(livroB);
    }

}
