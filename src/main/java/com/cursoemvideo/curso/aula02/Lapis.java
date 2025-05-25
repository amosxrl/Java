package aula02;
// This code defines a class Lapis with attributes and methods to manage a pencil's state and actions.
public class Lapis {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean apontado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está apontado? " + this.apontado);
    }

    void escrever() {
        if (this.apontado == false) {
            System.out.println("ERRO!, Não posso escrever.");
            System.out.println(" ");
        } else {
            System.out.println("Estou escrevendo.");
            System.out.println(" ");
        }
    }

    void apontar() {
        this.apontado = true;
    }

    void apagar() {
        System.out.println("Apagando...");
        System.out.println(" ");
    }
    void afiar() {
        System.out.println("Afiando...");
        System.out.println(" ");
    }
    void quebrar() {
        System.out.println("Quebrando...");
        System.out.println(" ");
    }
}
