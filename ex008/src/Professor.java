public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento(double novoSalario) {
        if (this.getSalario() < novoSalario) {
            this.setSalario(novoSalario);
        } else {
            System.out.println("[ERRO] O novo salário não pode ser menor que o salário anterior!");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
