import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Variables generales
        int hour;
        int minutes;
        int select;
        int day;
        String dayPrint = "";

        int hourSpain;
        int hourJapan;

        //Variables para continuar o terminar el programa
        boolean continueBool = true;
        int selectContinue;

        //Bucle del programa
        while (continueBool){

            hour = 0;
            minutes = 0;
            day = 0;
            select = 0;

            //Se pide la hora
            while (hour <= 0 || hour > 24){

                System.out.println(" ");
                System.out.println("Introduce la hora (formato de 24 horas):");

                hour = read.nextInt();

                if (hour < 0 || hour > 24) System.out.println("Introduce una hora válida.");

            }

            //Se piden los minutos
            while (minutes <= 0 || minutes > 59){

                System.out.println(" ");
                System.out.println("Introduce los minutos:");

                minutes = read.nextInt();

                if (minutes < 0 || minutes > 59) System.out.println("Introduce un minutaje válido.");

            }

            //Se pide el día
            while (day == 0 || day > 7){

                System.out.println(" ");
                System.out.println("Introduce el día");
                System.out.println("1. Lunes | 2. Martes | 3. Miércoles | 4. Jueves | 5. Viernes | 6. Sábado | 7. Domingo");

                day = read.nextInt();

                if (day == 0 || day > 7) System.out.println("Introduce un día válido.");

            }

            //Se pide el país

            while (select == 0 || select > 3){

                System.out.println(" ");
                System.out.println("Elige un país:");
                System.out.println("1. España | 2. Japón");

                select = read.nextInt();

                if (select == 0 || select > 3) System.out.println("Introduce un país válido.");

            }

            //En base al país, se lleva a cabo un cálculo
            switch (select){

                case 1 -> {

                    hourJapan = hour + 8;

                    if (hourJapan > 24){

                        day++;

                        if (day == 8) day = 1;

                    }

                    switch (hourJapan){
                        case 25 -> hourJapan = 1;
                        case 26 -> hourJapan = 2;
                        case 27 -> hourJapan = 3;
                        case 28 -> hourJapan = 4;
                        case 29 -> hourJapan = 5;
                        case 30 -> hourJapan = 6;
                        case 31 -> hourJapan = 7;
                        case 32 -> hourJapan = 8;
                    }

                    switch (day){
                        case 1 -> dayPrint = "Lunes";
                        case 2 -> dayPrint = "Martes";
                        case 3 -> dayPrint = "Miércoles";
                        case 4 -> dayPrint = "Jueves";
                        case 5 -> dayPrint = "Viernes";
                        case 6 -> dayPrint = "Sábado";
                        case 7 -> dayPrint = "Domingo";
                    }

                    System.out.println(" ");
                    System.out.println("Japón - " + hourJapan + ":" + minutes + ", " + dayPrint);

                }

                case 2 -> {

                    hourSpain = hour - 8;

                    if (hourSpain < 0){

                        day--;

                        if (day == 0) day = 7;

                    }

                    switch (hourSpain){
                        case -1 -> hourSpain = 23;
                        case -2 -> hourSpain = 22;
                        case -3 -> hourSpain = 21;
                        case -4 -> hourSpain = 20;
                        case -5 -> hourSpain = 19;
                        case -6 -> hourSpain = 18;
                        case -7 -> hourSpain = 17;
                    }

                    switch (day){
                        case 1 -> dayPrint = "Lunes";
                        case 2 -> dayPrint = "Martes";
                        case 3 -> dayPrint = "Miércoles";
                        case 4 -> dayPrint = "Jueves";
                        case 5 -> dayPrint = "Viernes";
                        case 6 -> dayPrint = "Sábado";
                        case 7 -> dayPrint = "Domingo";
                    }

                    System.out.println(" ");
                    System.out.println("España - " + hourSpain + ":" + minutes + ", " + dayPrint);

                }

                default -> System.out.println("Introduce un carácter válido.");

            }

            //Se pide al usuario si quiere continuar
            System.out.println(" ");
            System.out.println("¿Quieres introducir otra hora?");
            System.out.println("1. Sí | 2. No");

            selectContinue = read.nextInt();

            if (selectContinue == 2) continueBool = false;

        }

        read.close();
        
    }
}
