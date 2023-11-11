public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Essa caneta possui os seguintes atributos:");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tampada: "+ this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("[ERRO]");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void pintar() {
        if (this.tampada == true) {
            System.out.println("[ERRO]");
        } else {
            System.out.println("Pintando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}
