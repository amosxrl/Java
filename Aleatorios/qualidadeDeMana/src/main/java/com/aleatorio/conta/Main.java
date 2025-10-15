package com.aleatorio.conta;

public class Main {
    public static void main(String[] args) {
        float vermelho = (float) 0.7;
        float amarelo = (float) 0.8;
        float verde = (float) 0.9;
        float azul = (float) 0.5;

        float preto, verm, ama, ver, azu, rosa, dourado;

        preto = 10000;
        verm = (preto / vermelho);
        ama = (verm / amarelo);
        ver = ama / verde;
        azu = ver / azul;
        rosa = azu / azul;
        dourado = rosa / azul;

        System.out.println("Nível 2 Eterno ---------------");
        System.out.println("Qualidade preta: " + preto);
        System.out.println("Qualidade vermelha: " + verm);
        System.out.println("Qualidade amarela: " + ama);
        System.out.println("Qualidade verde: " + ver);
        System.out.println("Qualidade azul: " + azu);
        System.out.println("Qualidade rosa: " + rosa);
        System.out.println("Qualidade dourada: " + dourado);
    }
}