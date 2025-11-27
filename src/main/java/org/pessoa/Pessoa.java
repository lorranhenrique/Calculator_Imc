package org.pessoa;

public class Pessoa {

    private String genero;
    private float peso;
    private float altura;
    private float imc;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if(!genero.equals("masculino") && !genero.equals("feminino")) {
            throw new IllegalArgumentException("genero invalido");
        }
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0 ){
            throw new IllegalArgumentException("peso invalido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("altura invalida");
        }
        this.altura = altura;
    }

    public float getImc(){
        return imc;
    }
    public void setImc(){
        imc = calcularImc();
    }

    public float calcularImc(){
        return peso/ (altura * altura);
    }
}

