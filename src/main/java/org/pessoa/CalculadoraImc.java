package org.pessoa;

public class CalculadoraImc
{
    public String definirStatusImc(Pessoa pessoa)
    {
        float imc = pessoa.getImc();
        var genero = pessoa.getGenero();

        if("masculino".equals(genero)){
            if(imc < 20.7) {
                return "Abaixo do peso";
            }
            else if(imc < 26.4) {
                return "Peso normal";
            }
            else if(imc < 27.8) {
                return "Marginalmente acima";
            }
            else if(imc < 31.1) {
                return "Acima do peso";
            }
            return "Obeso";
        }
        else{
            if(imc < 19.1) {
                return "Abaixo do peso";
            }
            else if(imc < 25.8) {
                return "Peso normal";
            }
            else if(imc < 27.2) {
                return "Marginalmente acima";
            }
            else if(imc < 32.3) {
                return "Acima do peso";
            }
            return "Obeso";
        }
    }
}