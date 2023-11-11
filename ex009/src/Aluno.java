public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private boolean statusMatricula = true;

    public void pagarMensalidade() {
        System.out.println("* Pagando mensalidade do aluno " + this.getNome() + "... *");
    }

    public void cancelaMatricula() {
        if (getStatusMatricula()) {
            this.setStatusMatricula(false);
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }
}
