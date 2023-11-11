
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        //c1.tampada = false;
        c1.carga = 50;

        //c1.status();
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Vermelha";
        //c2.tampada = true;

        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}