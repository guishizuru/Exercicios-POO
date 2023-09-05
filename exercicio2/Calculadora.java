package exercicio2;

public class Calculadora {

    public double soma (double numero1, double numero2){
        return numero1 + numero2;
    }
    public double subtrair (double numero1, double numero2){
        return  numero2 - numero1;
    }
    public double multiplicar(double numero1, double numero2){
        return  numero1 * numero2;
    }
    public double dividir(double numero1,double numero2){
        if(numero2 == 0){
            System.out.println("Infelizmente nao poderemos continuar a divisão, pois foi diagnosticado uma soma por 0");
            return 0;
        }
        return  numero1 / numero2;
    }
}
