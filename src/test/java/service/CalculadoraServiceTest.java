package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    //executar antes de cada teste
    @Before
    public void service(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void operacaoDeSoma(){
        //Given
        int a = 1;
        int b = 2;

        //When
        int resultado = calculadoraService.somar(a,b);

        //Then
        Assert.assertEquals(3, resultado );
    }

    @Test
    public void operacaoDeSubtracao(){
        //Given
        int a = 3;
        int b = 2;

        //When
        int resultado = calculadoraService.subtrair(a,b);

        //Then
        Assert.assertEquals(1, resultado );
    }

    @Test
    public void operacaoDeDivisao(){
        //Given
        int a = 10;
        int b = 2;

        //When
        int resultado = calculadoraService.dividir(a,b);

        //Then
        Assert.assertEquals(5, resultado );
    }

    @Test
    public void operacaoDeMultiplicacao(){
        //Given
        int a = 5;
        int b = 2;

        //When
        int resultado = calculadoraService.multiplicar(a,b);

        //Then
        Assert.assertEquals(10, resultado );
    }

    @Test
    public void calcularAreaDeQuadrado(){
        //Given
        Quadrado quadrado = new Quadrado();

        //When
        double area = calculadoraService.calcularAreaQuadrado(quadrado.getLado());

        //Then
        Assert.assertTrue(area == 1);
    }

    @Test
    public void calcularAreaDeTriangulo(){
        //Given
        Triangulo triangulo = new Triangulo();

        //When
        double areaTriangulo = calculadoraService.calcularAreaTriangulo(triangulo.getBase(), triangulo.getAltura());

        //Then
        Assert.assertTrue(areaTriangulo == 1);
    }

    @Test
    public void calcularTrianguloMenorAreaTriangulosDiferentes(){
        //Given
        Triangulo triangulo1 = new Triangulo(10,20);
        Triangulo triangulo2 = new Triangulo(15,25);

        //When
        Triangulo trianguloMenorArea = calculadoraService.trianguloDeMenorArea(triangulo1,triangulo2);

        //Then
        Assert.assertTrue(triangulo1 == trianguloMenorArea);
    }

    @Test
    public void calcularTrianguloMenorAreaTriangulosIguais(){
        //Given
        Triangulo triangulo1 = new Triangulo(10,20);
        Triangulo triangulo2 = new Triangulo(10,20);

        //When
        Triangulo trianguloMenorArea = calculadoraService.trianguloDeMenorArea(triangulo1,triangulo2);

        //Then
        Assert.assertNull(trianguloMenorArea);
    }

    @Test
    public void calcularQuadradoMenorAreaQuadradosDiferentes(){
        //Given
        Quadrado quadrado1 = new Quadrado( 10);
        Quadrado quadrado2 = new Quadrado(20);

        //When
        Quadrado quadradoMenorArea = calculadoraService.quadradoDeMenorArea(quadrado1,quadrado2);

        //Then
        Assert.assertTrue(quadrado1 == quadradoMenorArea);
    }

    @Test
    public void calcularQuadradoMenorAreaQuadradosIguais(){
        //Given
        Quadrado quadrado1 = new Quadrado( 10);
        Quadrado quadrado2 = new Quadrado(10);

        //When
        Quadrado quadradoMenorArea = calculadoraService.quadradoDeMenorArea(quadrado1,quadrado2);

        //Then
        Assert.assertNull(quadradoMenorArea);
    }



}
