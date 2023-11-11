public class Main {
    public static void main(String[] args) {
        Professor luiz = new Professor();
        Funcionario tereza = new Funcionario();
        Aluno jaiminho = new Aluno();

        luiz.setNome("Luiz");
        System.out.println(luiz.getNome());

        tereza.setNome("Tereza");
        tereza.setSetor("Diretora");
        System.out.println(tereza.getNome() + ", cargo de " + tereza.getSetor());

        jaiminho.setNome("Jaiminho");
        jaiminho.setCurso("Logística");
        jaiminho.setIdade(18);
        jaiminho.setSexo('M');
        jaiminho.cancelaMatricula();
        System.out.println(jaiminho.getNome() + " estudante de " + jaiminho.getCurso());
        System.out.println(jaiminho.toString());
    }
}