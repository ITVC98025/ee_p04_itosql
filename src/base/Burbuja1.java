package base;
/**
 * Write a description of class Burbuja1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burbuja1{
    public String [] burbuja(String [] A){
        String aux;
        for(int i=1; i<=A.length; i++) {  
            for(int j=0; j<A.length-i; j++) { 
                if( A[j].compareTo( A[j+1] ) > 0 ) { 
                    aux   = A[j]; 
                    A[j]  = A[j+1]; 
                    A[j+1]= aux; 
                }    
            } 
        }
        return A;
    }
}