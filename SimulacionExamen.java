/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacionexamen;
import static simulacionexamen.ejercicio1.ejercicio1;
import static simulacionexamen.ejercicio2.ejercicio2;
import static simulacionexamen.ejercicio3.ejercicio3;
/**
 *
 * @author joch
 */
public class SimulacionExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] lista1 = {10, 15, 3, 8, 22};
        int[] lista2 = {7, 18, -2, 6, 14};
        
        System.out.println("El resultado para la lista [10, 15, 3, 8, 22] y k = 30 es " + ejercicio1(lista1, 30));
        System.out.println("El resultado para la lista [10, 15, 3, 8, 22] y k = 31 es " + ejercicio1(lista1, 31));
        System.out.println("El resultado para la lista [7, 18, -2, 6, 14] y k = 5 es " + ejercicio1(lista2, 5));
        System.out.println("El resultado para la lista [7, 18, -2, 6, 14] y k = 24 es " + ejercicio1(lista2, 24));
        System.out.println("El resultado para la lista [7, 18, -2, 6, 14] y k = 50 es " + ejercicio1(lista2, 50));
        
        
        int[] lista3 = {-10, -10, 5, 2};
        int[] lista4 = {-10, 10, 5, 2};
        
        System.out.println("El producto más grande de 3 elementos para la lista [10, 15, 3, 8, 22] es " + ejercicio2(lista1));
        System.out.println("El producto más grande de 3 elementos para la lista [7, 18, -2, 6, 14] es " + ejercicio2(lista2));
        System.out.println("El producto más grande de 3 elementos para la lista [-10, -10, 5, 2] es " + ejercicio2(lista3));
        System.out.println("El producto más grande de 3 elementos para la lista [-10, 10, 5, 2] es " + ejercicio2(lista4));
        
        char[][] sopadeletras = {{'Z','U','C','O'},
                                 {'L','C','T','T'},
                                 {'C','E','O','P'},
                                 {'E','R','C','O'}};
        
        System.out.println("La palabra OPTO se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OPTO"));
        System.out.println("La palabra OPRO se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OPRO"));
        System.out.println("La palabra OCRE se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OCRE"));
        System.out.println("La palabra POEB se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "POEB"));
        System.out.println("La palabra OTEE se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OTEE"));
        System.out.println("La palabra EETO se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "EETO"));
        System.out.println("La palabra ZCOO se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "ZCOO"));
        System.out.println("La palabra OOCZ se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OOCZ"));
        System.out.println("La palabra OTEA se encuentra en la sopa de letras? " + ejercicio3(sopadeletras, "OTEA"));
                              
        
    }
    
}
