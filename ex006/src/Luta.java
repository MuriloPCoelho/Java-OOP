import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Constructor

    //Métodos Especiais (getters & setters)
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //Métodos

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }

    public void lutar() {
        if (getAprovada()) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2

            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("O desafiado ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("O desafiante ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                default -> {
                }
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
}



