public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        Cachorro cao = new Cachorro();
        Canguru pula = new Canguru();

        m.setIdade(13);
        m.setPeso(28.5);
        m.setMembros(4);
        System.out.println(m.toString());
        m.locomover();

        pula.locomover();

    }
}