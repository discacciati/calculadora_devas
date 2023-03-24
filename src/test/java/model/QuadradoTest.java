package model;

import org.junit.Assert;
import org.junit.Test;

public class QuadradoTest {
    @Test
    public void quadradoNaoPodeTerLadoIgual0(){
        //Given
        Quadrado quadrado = new Quadrado(5);

        //Then
        Assert.assertNotEquals(0, quadrado.getLado());
    }
}
