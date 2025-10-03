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

}