public class Aluno extends Pessoa{
    private boolean statusMatricula = true;
    private String curso;

    public void cancelaMatricula() {
        if (this.getStatusMatricula()) {
            this.setStatusMatricula(false);
        } else {
            System.out.println("[ERRO]A matrícula não está ativa!");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "\nnome= "+ this.getNome() +
                ",\nidade= "+ this.getIdade() +
                ",\nsexo= "+ this.getSexo() +
                ",\nstatusMatricula= " + statusMatricula +
                ",\ncurso= '" + curso + '\'' +
                ",\n}";
    }

    public boolean getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(boolean statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
