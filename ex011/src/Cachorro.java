public class Cachorro extends Lobo{
    public void reagir(String frase) {
        if (frase.equals("agradável")) {
            System.out.println("O cachorro abanou e latiu de forma amistosa");
        } else if (frase.equals("agressiva")){
            System.out.println("O cachorro começou a rosnar de forma amedrontadora");
        }
    }
    public void reagir(int horas, int minutos) {
        if (horas > 5  && horas < 12) {
            System.out.println("O cachorro abanou o rabo");
        } else if (horas < 18) {
            System.out.println("O cachorro abanou o rabo e latiu");
        } else {
            System.out.println("O cachorro apenas late");
        }
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("O cachorro abana o rabo de felicidade ao ver seu dono");
        } else {
            System.out.println("O cachorro começou a rosnar e latir");
        }
    }
    public void reagir(int idade, double peso) {
        if (idade < 4 && peso < 5.9) {
            System.out.println("O dog abanou o seu rabo");
        } else if (idade < 4) {
            System.out.println("O dog latiu");
        } else if (peso < 5.9) {
            System.out.println("O dog rosnou");
        } else {
            System.out.println("O dog ignorou");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

}
