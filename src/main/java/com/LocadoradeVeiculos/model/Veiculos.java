package model;
public class Veiculos {
    private String placa;
    private String fabricante;
    private String modelo;
    private int ano;
    private boolean disponivel;


    //metodo construtor
    public Veiculos(String placa, String marca, String modelo, int ano, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return fabricante;
    }

    public void setMarca(String marca) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
