
import java.util.Scanner;
public class Seis {
    public static void main(String[] args) {


        //vereficar si es dia laboral

        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el dia para verificar si es laboral");
        String dia=leer.nextLine();

        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println("Lunes es una dia laboral");
                break;

            case "martes":
                System.out.println("Martes es una dia laboral");
                break;

            case "miercoles":
                System.out.println("Miércoles es una dia laboral");
                break;

            case "jueves":
                System.out.println("Jueves es una dia laboral");
                break;

            case "viernes":
                System.out.println("Viernes es una dia laboral");
                break;

            case "sabado":
                System.out.println("Sábado no es una dia laboral");
                break;

            case "domingo":
                System.out.println("Domingo no es una dia laboral");
                break;
            default:
                System.out.println("ingrese un dia valido");
                break;
        }

    }
}
