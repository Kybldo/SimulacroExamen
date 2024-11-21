import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Selección de programa
        char select;

        //Variables del programa de notas
        int grade;
        int gradeNumber;
        int gradePassed = 0;
        int gradeFailed = 0;

        //Variables del programa de billetes
        int passengers;
        String name;
        int age;
        double price;
        double priceTotal = 0;

        //Inicia la selección de programa
        System.out.println(" ");
        System.out.println("Selecciona el programa:");
        System.out.println(" ");
        System.out.println("(a) Aprobados y suspendidos");
        System.out.println("(b) Billetes a Madrid");
        System.out.println("(c) Salir");
        System.out.println(" ");

        select = read.nextLine().charAt(0);


        switch (select) {

            case 'a', 'A' -> {

                System.out.println(" ");
                System.out.println("¿Cuantas notas quieres introducir?");

                gradeNumber = read.nextInt();

                if (gradeNumber == 0){

                    System.out.println("No has introducido notas.");

                } else {

                    for (int i = 0; i < gradeNumber; i++){

                        System.out.println(" ");
                        System.out.println("Introduce la nota:");

                        grade = read.nextInt();

                        if (grade >= 5){

                            gradePassed++;

                        } else gradeFailed++;

                    }

                    System.out.println(" ");

                    if (gradePassed > gradeFailed){

                        System.out.println("Hay más aprobados que suspensos.");

                    } else if (gradePassed < gradeFailed) {

                        System.out.println("Hay más suspensos que aprobados.");

                    } else System.out.println("Hay los mismos aprobados que suspensos.");

                }
            }

            case 'b', 'B' -> {

                //Esta es mi elección para el control de pasajeros
                System.out.println(" ");
                System.out.println("Introduce el número de pasajeros:");

                passengers = read.nextInt();

                for (int i = 0; i < passengers; i++){

                    System.out.println(" ");
                    System.out.println("Introduce el nombre del pasajero " + (i + 1) + ":");

                    //Hay dos instancias para lidiar con el bug del buffer
                    name = read.nextLine();
                    name = read.nextLine();

                    System.out.println(" ");
                    System.out.println("Introduce la edad de " + name + ":");

                    age = read.nextInt();

                    if (age >= 65){

                        price = 32 * 0.9;

                    } else if (age >= 12 && age <= 15) {

                        price = 32 * 0.82;

                    } else if (age >= 4 && age <= 11) {

                        price = 32 * 0.65;

                    } else if (age <= 4) {

                        price = 0;

                    } else price = 32;

                    System.out.println("Billete de " + name + ": " + price + " euros.");

                    priceTotal += price;

                }

                System.out.println(" ");
                System.out.println("El precio total a pagar será " + priceTotal + " euros.");

            }

            case 'c', 'C' -> {}

            default -> System.out.println("Introduce un carácter válido.");

        }

        read.close();

    }
}
