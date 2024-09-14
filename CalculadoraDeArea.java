package com.mycompany.questao_1;

public class CalculadoraDeArea
{
    public double calcularArea(double lado)
    {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura)
    {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean isCirculo)
    {
        if (isCirculo)
        {
            return Math.PI * raio * raio;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        CalculadoraDeArea calculadora = new CalculadoraDeArea();

        double areaQuadrado = calculadora.calcularArea(5);
        double areaRetangulo = calculadora.calcularArea(4, 6);
        double areaCirculo = calculadora.calcularArea(3, true);

        System.out.println("Area do quadrado: " + areaQuadrado);
        System.out.println("Area do retangulo: " + areaRetangulo);
        System.out.println("Area do circulo: " + areaCirculo);
    }
}