/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg1;
import java.util.Scanner;
/**
 *
 * @author PRACTICA
 */
public class Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Cuantos autos desea ingresar: ");
        a = teclado.nextInt();
        Autos test1 = new Autos(a,6);
        test1.asignarDatos();
        test1.Menu();
    }
}