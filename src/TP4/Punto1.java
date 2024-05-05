package TP4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numToGuest = random.nextInt(1, 100);
        boolean guestCorrect = false;
        int tries = 0;

        System.out.println("ADIVINAR EL NÚMERO");
        while (!guestCorrect){
            System.out.println("\nintento"+(tries+1)+": ");
            try {
                int number = scanner.nextInt();
                tries++;
                if (number>numToGuest){
                    System.out.println("el número es menor");
                }else if (number<numToGuest){
                    System.out.println("el número es mayor");
                }else {
                    System.out.println("CORRECTO adivinaste el número");
                    System.out.println("Intentos: "+tries);
                    guestCorrect = true;
                }
            }catch (InputMismatchException ex){
                System.out.println("Entrada erronea: debes ingresar un número entero.");
                scanner.nextLine();
                tries++;
            }

        }
    }
}
