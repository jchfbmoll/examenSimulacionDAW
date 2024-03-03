/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacionexamen;

/**
 *
 * @author joch
 */
public class ejercicio3 {
    public static boolean ejercicio3(char[][] sopadeletras, String palabra){
        
        boolean isPalabra = true;

        for (int i = 0; i<sopadeletras.length;i++){
            
            isPalabra = true;

            for(int j = 0; j<sopadeletras[0].length && isPalabra; j++){
                if(sopadeletras[i][sopadeletras[0].length-j-1]!=palabra.charAt(j)){
                    isPalabra = false;
                    
                }
   
            }
            if (isPalabra) return true;
        }
        
        for (int i = 0; i<sopadeletras.length;i++){
            
            isPalabra = true;

            for(int j = 0; j<sopadeletras[0].length && isPalabra; j++){
                if(sopadeletras[sopadeletras.length-j-1][i]!=palabra.charAt(j)){
                    isPalabra = false;
                    
                }
   
            }
            if (isPalabra) return true;
        }
        
        isPalabra = true;
        for(int i = 0; i<sopadeletras.length;i++){
            if(sopadeletras[i][i]!=palabra.charAt(i)){
                    isPalabra = false;
                    
                }
            
        }      
        if (isPalabra) return true;
        
        isPalabra = true;
        for(int i = 0; i<sopadeletras.length;i++){
            if(sopadeletras[sopadeletras.length-1-i][sopadeletras.length-1-i]!=palabra.charAt(i)){
                    isPalabra = false;
                    
                }
            
        }        
        if (isPalabra) return true;
        
        isPalabra = true;
        for(int i = 0; i<sopadeletras.length;i++){
            if(sopadeletras[i][sopadeletras.length-1-i]!=palabra.charAt(i)){
                    isPalabra = false;
                    
                }
            
        }       
        if (isPalabra) return true;
        
        isPalabra = true;
        for(int i = 0; i<sopadeletras.length;i++){
            if(sopadeletras[sopadeletras.length-1-i][i]!=palabra.charAt(i)){
                    isPalabra = false;
                    
                }
            
        }       
        if (isPalabra) return true;
        
        
        return false;
    }
}
