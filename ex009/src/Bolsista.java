public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("* Bolsa renovada com sucesso! *");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("* Pagando mensalidade do bolsista " + this.getNome() + "... *");
    }
}
