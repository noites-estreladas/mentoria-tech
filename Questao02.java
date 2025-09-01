package PrimeiraAvaliacao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da Temperatura em ºC: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("==== Escalas de Temperaturas ====");
        System.out.printf("Temperatura em Celsius %.1f ºC \n", celsius);
        System.out.printf("Temperarura em Fahrenheit %.1f ºF \n", fahrenheit);
        System.out.printf("Temperarura em kelvin %.1f ºK \n", kelvin);
        System.out.println("===================================");


    }
}
