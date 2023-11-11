public class Conta {
    private double saldo;
    private double fatura;

    public void sacar(double valorSaque) {
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
        }
    }

    public void pagarFatura() {

    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
        }
    }

    public void extrato(){
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Fatura: " + this.fatura);
    }
}
