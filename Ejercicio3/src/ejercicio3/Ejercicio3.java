/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio3 {
    //1. Inicio
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. Declaro las variables
        String contador = "si";
        String nombre;
        String cadenaFinal = "";
        int numeroDias;
        double costoDia;
        double pagar;
      
        while (contador.equals("si")) {            
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();  
        System.out.println("Ingrese el número de días trabajados: ");
        numeroDias = entrada.nextInt();  
        System.out.println("Ingrese el valor del pago del día trabajado:");
        costoDia = entrada.nextDouble();
        pagar = costoDia*numeroDias;
        cadenaFinal = String.format("%s%s\t%d\t$%.2f\t\t$%.2f\n",
        cadenaFinal,nombre,numeroDias,costoDia,pagar);
        System.out.println("Ingrese si, en caso de colocar mas empleados\n"
                +"o\n"
                +"Ingrese no, si ya desea ver la tabla");
                entrada.nextLine();
                contador = entrada.nextLine();
        }
       System.out.printf("%s\n", cadenaFinal);
    }  
}