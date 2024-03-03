/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacionexamen;

/**
 *
 * @author joch
 */
public class ejercicio2 {
    public static int ejercicio2(int[] lista){
        
        for(int i = lista.length ; i >=0; i--){
            for(int j = 0; j< i - 1; j++){
                if(lista[j] > lista[j+1]){
                    int aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
                
            }
            
            
        }
        
        int procNeg = lista[0] * lista[1] * lista[lista.length-1];
        int procPos = lista[lista.length-1]*lista[lista.length-2]*lista[lista.length-3];
        
        return procNeg >= procPos ? procNeg : procPos;
        
    }
}
