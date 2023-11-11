public class Cachorro extends Mamifero {
    public void enterrarOsso() {
        System.out.println("Enterrando osso...");
    }

    public void abanarRabo() {
        System.out.println("Rabo abanando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
}
