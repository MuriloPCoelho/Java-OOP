public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos Especiais

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());

            for (int i = 0;i < (this.getVolume()); i += 10) {

                System.out.print("\u25A0 ");
            }
            System.out.print("[" + this.getVolume() + "%" +"]");

        } else {
            System.out.println("[ERRO] O aparelho está desligado.");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    int volumeAnterior = 0;
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() < 0) {
            volumeAnterior = getVolume();
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(volumeAnterior);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.ligado && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
