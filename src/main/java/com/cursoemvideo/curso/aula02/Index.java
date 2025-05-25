package aula02;

public class Index {
    public static void main(String[]args){
        Caneta c1 = new Caneta();
        c1.modelo = "Compacto";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        c1.tampar();

        Lapis c2 = new Lapis();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 100;
        c2.apontar();
        c2.escrever();
        c2.afiar();
        c2.quebrar();
        c2.status();
        c2.apagar();
    }
}
