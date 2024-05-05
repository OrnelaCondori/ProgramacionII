package TP4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULAR AREA TRIANGULO");

        try{
            System.out.println("ingrese la base: ");
            double base = scanner.nextDouble();
            System.out.println("ingrese la altura: ");
            double height = scanner.nextDouble();

            double area = (base*height)/2;
            System.out.println("el area del triangulo es: "+area);
        }catch (InputMismatchException ex){
            System.out.println("Error: Debes ingresar valores numéricos.");
        }finally {
            scanner.close();
        }
    }
}
