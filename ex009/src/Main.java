public class Main {
    public static void main(String[] args) {
        Visitante fulano = new Visitante();
        Aluno beltrano = new Aluno();
        Bolsista sicrano = new Bolsista();
        Tecnico jorge = new Tecnico();

        fulano.setNome("Fulano");
        fulano.setIdade(20);
        fulano.setSexo('O');
        System.out.println(fulano.toString());

        beltrano.setNome("Beltrano");
        beltrano.setIdade(22);
        beltrano.setSexo('M');
        beltrano.setCurso("Gestão");
        beltrano.setMatricula(1010111);
        beltrano.pagarMensalidade();
        System.out.println(beltrano.toString());

        sicrano.setNome("Sicrano");
        sicrano.setIdade(23);
        sicrano.setSexo('F');
        sicrano.setCurso("Estatística");
        sicrano.setMatricula(110101100);
        sicrano.pagarMensalidade();
        System.out.println(sicrano.toString());

        jorge.setNome("Jorge");
        jorge.setIdade(43);
        jorge.setSexo('M');
        System.out.println(jorge.toString());
    }
}