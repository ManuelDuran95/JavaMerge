import java.util.Scanner;
import  java.lang.Math;
public class Cinco {
    public static void main(String[] args) {

        //Resolver ecuacion de segundo grado de la forma ax^2 +bx +c = 0

        //variables
        double a,b,c,d,aux,x1,x2;

        //instancia para leer datos
        Scanner leer= new Scanner(System.in);

        //leer datos
        System.out.println("Resolver ecuacion de segundo grado");
        System.out.println("De la forma ax^2 +bx +c = 0");
        System.out.println("ingrese a=");
        a=leer.nextDouble();
        System.out.println("ingrese b=");
        b=leer.nextDouble();
        System.out.println("ingrese c=");
        c=leer.nextDouble();
        System.out.println(">> Resultado...");
        //COmporbar si no resultan numeros imaginarios
        d=Math.pow(b,2)-4*a*c;
        if(d<0){
            System.out.println("No se puede resolver, contiene numeros imaginarios");

        }else {
            aux=d;
            x1=((-b)+Math.sqrt(aux))/(2*a);
            x2=((-b)-Math.sqrt(aux))/(2*a);
            System.out.println("X1= "+x1+ " X2= "+x2);
        }




    }

    }
