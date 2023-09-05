package exercicio1;

import exercicio2.Calculadora;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularCircunferencia());
        System.out.println(circulo.getRaio());

    }
}
