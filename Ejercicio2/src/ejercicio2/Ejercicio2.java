/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio2 {
    //1. Inicio
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. Declaro las variables
        int  contadorUno = 1;
        int  contadorDos = 10;
        int  contadorTres = 20;
        while (contadorUno <= 6) {            
            if ((contadorUno % 2) == 0){
           System.out.println(contadorUno + "/" + contadorTres);
            contadorTres = contadorTres + 1;
            }else{
            System.out.println(contadorUno + "/" + contadorDos);
            contadorDos = contadorDos + 1;
            }
            contadorUno= contadorUno + 1;
    }   
}
}