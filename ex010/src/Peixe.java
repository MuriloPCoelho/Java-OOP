public class Peixe extends Animal{
    protected String corPena;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Sugando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
}
