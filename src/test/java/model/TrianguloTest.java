package model;

import org.junit.Assert;
import org.junit.Test;

public class TrianguloTest {
    @Test
    public void trianguloNaoPodeTerBaseIgual0(){
        //Given
        Triangulo triangulo1 = new Triangulo(2,3);

        //Then
        Assert.assertFalse(triangulo1.getBase() == 0);
    }

    @Test
    public void trianguloNaoPodeTerAlturaIgual0(){
        //Given
        Triangulo triangulo2 = new Triangulo(5,10);

        //Then
        Assert.assertFalse(triangulo2.getAltura() == 0);
    }

}
