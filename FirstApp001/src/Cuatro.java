

import java.util.Scanner;
public class Cuatro {
    public static void main(String[] args) {
        //variables
        int num;
        double res;

        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese un numero entero para comprobar si es divisible entre dos");
        try {
            num = leer.nextInt();
            res=num%2;
            if(res==0){
                System.out.println(">>"+"El numero "+ num +" es divisible entre 2");
            }else{
                System.out.println("No es divisible ");
            }

        }
        catch (Exception e){
            System.out.println("Ocurrio un problema, revise el numero ingresado "+ e);

        }
    }
}
