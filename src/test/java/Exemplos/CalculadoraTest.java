package Exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    public Calculadora calc = new Calculadora();

    @Test
    void somardedoisvalorescomparacaoderesultado() {
        double valoresperado = 20;
        double resultado = calc.somar(10,10);
        Assertions.assertEquals(valoresperado, resultado); //COMPARAR A DOIS VALORES COM JUNIT 5

        //TESTE MANUAL SEM O JUNIT 5

        /*if(valoresperado == resultado){
            System.out.println("Passou nos testes");
        }else {
            System.out.println("Não passou nos testes");
        }*/
    }

    @Test
    void subtracaodedoisvaloresparavaloresperado() {
        double valoresperado = 5;
        double resultado = calc.subtracao(10,5);
        Assertions.assertEquals(valoresperado,resultado);
    }

    @Test
    void divisaodedoisvaloresparavaloresperado() {
        int valoresperado = 1;
        int resultado = calc.divisao(10,10);
        var error = Assertions.assertThrows(ArithmeticException.class, () -> calc.divisao(10,0));
        Assertions.assertEquals("/ by zero", error.getMessage());
    }

    @Test
    void multiplicaodedoisvaloresparavaloresperado() {
    int valoresperado = 50;
    int resultado = calc.multi(5,10);
    Assertions.assertEquals(valoresperado, resultado);
    }
}