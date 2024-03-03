/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacionexamen;

/**
 *
 * @author joch
 */
public class ejercicio1 {
    public static boolean ejercicio1(int[] lista, int k){
        
        for(int i = 0; i<lista.length-1;i++){
            for(int j= i+1; j<lista.length; j++){
                
                if(lista[i] + lista[j] == k) {
                    
                    return true;
                    
                }
                
            }
            
        }
        
        
        
        return false;
    }
}
