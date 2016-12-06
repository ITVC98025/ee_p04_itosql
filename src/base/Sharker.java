package base;
public class Sharker <T extends Comparable<T>>
{
    public Sharker()
    {
       
    }

    public T [] sharkerSort( T[] arreglo){
        int izquierda,derecha,k;
        T aux;
        izquierda=1;
        derecha=arreglo.length-1;
        k=arreglo.length-1;
        int comparaciones=0,intercambios=0;
        while(izquierda<=derecha){
            for(int i=derecha;i>=izquierda;i--){
                int x=arreglo[i-1].compareTo(arreglo[i]);
                
                if(x>0){
                    aux=arreglo[i-1];
                    arreglo[i-1]=arreglo[i];
                    arreglo[i]=aux;
                    k=i;
                    intercambios++;
                }
                comparaciones++;
            }
            izquierda=k+1;
            for(int i=izquierda;i<=derecha;i++){
                int x=arreglo[i-1].compareTo(arreglo[i]);
                if(x>0){
                    aux=arreglo[i-1];
                    arreglo[i-1]=arreglo[i];
                    arreglo[i]=aux;
                    k=i;
                    intercambios++;
                }
                comparaciones++;
            }
            derecha=k-1;
        }
        return arreglo;
        
    }
}
