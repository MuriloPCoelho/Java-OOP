public class ContaBanco {
    //atributos
    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //construtor
    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;

        if (tipo == "CC" || tipo == "CP") {
            this.tipo = tipo;

            if (tipo == "CC") {
                this.saldo = 50;
            } else {
                this.saldo = 150;
            }
        } else {
            System.out.println("\u001B[31m[ERRO] Tipo de conta inválido!\u001B[0m");
        }

        this.dono = dono;
        this.status = true;
    }

    //Métodos especiais (getters & setters)
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos / Ações

    public void estadoAtual() {
        System.out.println("-------------------------------------------");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome do dono: " + getDono());
        System.out.println("Saldo da conta: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("-------------------------------------------");
    }

    public void abrirConta(String tipo) {

        if (!this.getStatus()) {
            this.setTipo(tipo);
            this.setStatus(true);

            if (tipo == "CC") {
                this.setSaldo(50);
            } else if (tipo == "CP") {
                this.setSaldo(150);
            }
        } else {
            System.out.println("\u001B[31m[ERRO] A conta já está aberta\u001B[0m");
        }


    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("\u001B[31m[ERRO] Você ainda possui saldo na conta, é necessário que não haja valor na conta, para que, ela possa ser fechada.\u001B[0m");
        } else if (this.getSaldo() < 0) {
            System.out.println("\u001B[31m[ERRO] Você possui pendências para serem quitadas, é necessário que a conta esteja regular, para que, ela possa ser fechada.\u001B[0m");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0 && this.status) {
            this.setSaldo(this.getSaldo() + valorDeposito);
        }
    }

    public void sacar(double valorSaque){
        if (this.getSaldo() < valorSaque) {
            System.out.println("\u001B[31m[ERRO] Você não possui saldo suficiente para sacar esse valor.\u001B[0m");
        } else if (!this.getStatus()) {
            System.out.println("\u001B[31m[ERRO] Sua conta está desativada.\u001B[0m");
        } else {
            this.setSaldo(this.getSaldo() - valorSaque);
        }

    }

    public void pagarMensalidade() {
        double valorMensalidade = 0;
        if (this.getTipo() == "CC") {
            valorMensalidade = 12;
        } else if (this.getTipo() == "CP") {
            valorMensalidade = 20;
        }

        if (getStatus() == true) {
            this.setSaldo(getSaldo() - valorMensalidade);
        } else {
            System.out.println(	"\u001B[31m[ERRO] Não há conta ativa.\u001B[0m");
        }

    }
}
