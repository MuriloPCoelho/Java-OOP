public class Caneta {
    private String modelo;
    private double ponta;

    private boolean tampada;

    public Caneta(String m, double p) {
        this.modelo = m;
        this.ponta = p;
        this.tampada = true;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }

}
