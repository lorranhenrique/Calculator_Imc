import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveRetornarFemininoAbaixoDoPeso() {
        pessoa.setPeso(19f);
        pessoa.setAltura(1f);
        pessoa.setGenero("feminino");
        assertEquals("Abaixo do peso", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1f);
        pessoa.setGenero("feminino");
        assertEquals("Peso normal", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcima() {
        pessoa.setPeso(27.1f);
        pessoa.setAltura(1f);
        pessoa.setGenero("feminino");
        assertEquals("Marginalmente acima", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarFemininoAcima() {
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1f);
        pessoa.setGenero("feminino");
        assertEquals("Acima do peso", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarFemininoObeso() {
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1f);
        pessoa.setGenero("feminino");
        assertEquals("Obeso", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoDoPeso() {
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        assertEquals("Abaixo do peso", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        assertEquals("Peso normal", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcima() {
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        assertEquals("Marginalmente acima", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarMasculinoAcima() {
        pessoa.setPeso(31f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        assertEquals("Acima do peso", pessoa.definirStatusImc());
    }

    @Test
    void deveRetornarMasculinoObeso() {
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        assertEquals("Obeso", pessoa.definirStatusImc());
    }


    @Test
    void deveVerificarPesoValido(){
        pessoa.setPeso(0.1f);
        assertEquals(0.1f, pessoa.getPeso());
    }

    @Test
    void deveVerificarPesoInvalido(){
        try{
            pessoa.setPeso(0f);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("peso invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarAlturaValida(){
        pessoa.setAltura(0.1f);
        assertEquals(0.1f, pessoa.getAltura());
    }

    @Test
    void deveVerificarAlturaInvalida(){
        try{
            pessoa.setAltura(0f);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("altura invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarGeneroValida(){
        pessoa.setGenero("masculino");
        assertEquals("masculino", pessoa.getGenero());
    }

    @Test
    void deveVerificarGeneroInvalida(){
        try{
            pessoa.setGenero("");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("genero invalido", e.getMessage());
        }
    }

}