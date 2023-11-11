
public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1, "CC", "Maico Azausqui");

        c1.sacar(50);
        c1.fecharConta();
        c1.abrirConta("CP");
        c1.depositar(275);
        c1.pagarMensalidade();
        c1.estadoAtual();
    }
}