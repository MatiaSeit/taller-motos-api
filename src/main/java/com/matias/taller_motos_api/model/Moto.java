package com.matias.taller_motos_api.model;

public class Moto {
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;
    private int cilindrada;
    private String color;

    public Moto(String matricula, String marca, String modelo, int anio, int cilindrada, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindrada = cilindrada;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
// new Moto("ABC123", "Honda", "CBR500R", 2020, 500, "Rojo");
// new Moto("DEF456", "Yamaha", "MT-07", 2021, 689, "Negro");