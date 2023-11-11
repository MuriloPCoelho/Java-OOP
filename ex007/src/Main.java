public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[2];

        pessoas[0] = new Pessoa("Luisa", 21, 'F');
        pessoas[1] = new Pessoa("Murilo", 22, 'M');

        livros[0] = new Livro("A culpa é das estrelas", "John Green", 255, pessoas[0]);
        livros[1] = new Livro("A revolução dos bichos", "George Orwell", 152, pessoas[1]);

        livros[0].folhear(200);
        livros[0].voltarPag();


        System.out.println(livros[0].detalhes());
        System.out.println(livros[1].detalhes());
    }
}