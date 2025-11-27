package org.pessoa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PessoaTest {

    @Mock
    Pessoa pessoa;

    @InjectMocks
    CalculadoraImc calculadoraImc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        pessoa = new Pessoa();
        calculadoraImc = new CalculadoraImc();
    }

    @Test
    void deveRetornarMasculinoAbaixoDoPeso() {
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        pessoa.setImc();
        assertEquals("Abaixo do peso", calculadoraImc.definirStatusImc(pessoa));
    }
    @Test
    void deveRetornarMasculinoPesoNormal() {
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1f);
        pessoa.setGenero("masculino");
        pessoa.setImc();
        assertEquals("Peso normal", calculadoraImc.definirStatusImc(pessoa));
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