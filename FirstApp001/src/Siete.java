import java.lang.Math;
import java.util.Scanner;
public class Siete {
    public static void main(String[] args){
        //Numeros aleatorios
        int a,b,c=0;

        Scanner leer=new Scanner(System.in);

        System.out.println("Generar numeros aleatrios entre dos numeros");
        System.out.println("Ingrese numero 1");
        a=leer.nextInt();
        System.out.println("Ingrese numero 2");
        b=leer.nextInt();
        do{
            System.out.println((int)Math.random());

        }while (c!=10);

    }


}
