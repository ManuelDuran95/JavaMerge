import  java.util.Scanner;
public class Uno {
    public static void main(String[] args) {

        //Declaración de variables
        int res = 0, num1 = 0, num2 = 0, op = 0;
        //Instancia para leer datos
        Scanner leer = new Scanner(System.in);
        //ciclo ejecutar el proceso hasta ingresar 5
        do {


        System.out.println("Operaciones con dos numeros -Ingrese una opción");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicación");
        System.out.println("4- Division");
        System.out.println("5- Salir");
        op = leer.nextInt();
        System.out.println("Ingrese numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = leer.nextInt();

        switch (op) {
            default:
                System.out.println("INGRESE UNA OPCIÓN VALIDA");
                break;
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
                break;
            case 4:
                if(num2!=0)
                res = num1 / num2;
                else {
                    System.out.println("No se pede dividir entre cero");
                }
                break;
            case 5:

                break;


        }
        //Muestra de resultados
        System.out.println("Resultado: "+ res);
        System.out.println("1-Continuar");
            System.out.println("5-Salir");
        op=leer.nextInt();
    }while (op!=5);







    }
}
