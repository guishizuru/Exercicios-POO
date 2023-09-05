package exercicio2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double numero1 = 10;
        double numero2 = 10;

        System.out.println(calculadora.dividir(numero1, numero2));
        System.out.println(calculadora.soma(numero1, numero2));
        System.out.println(calculadora.multiplicar(numero1, numero2));
        System.out.println(calculadora.subtrair(numero1, numero2));
    }
}
