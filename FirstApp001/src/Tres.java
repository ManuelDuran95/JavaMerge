import java.util.Scanner;
import java.lang.Math;
public class Tres {
    public static void main(String[] args) {
        //variables
        double A,r;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        r=leer.nextInt();
        A=Math.PI* Math.pow(r,2);
        System.out.println("El resultado es: "+A);
    }
}
