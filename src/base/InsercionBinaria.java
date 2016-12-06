package base;

public class InsercionBinaria <T extends Comparable<T>>
{
   
    public InsercionBinaria()
    {
        
    }

   public  T[] insercionB(T[] arreglo){      
        int i,k,izq,der,m,j; 
        T aux;
        
        for(i=1;i<arreglo.length;i++){
            aux=arreglo[i];
            izq=0;
            der=i-1;         
            while(izq<=der){
                m=(izq+der)/2; 
                int x=aux.compareTo(arreglo[m]);
                if(x < 0){
                    der=m-1;
                }else
                    izq=m+1;
            }
            j=i-1;
            while(j >= izq){
                arreglo[j+1]=arreglo[j];
                j=j-1;
            }
            arreglo[izq]=aux;
        }
        return arreglo;
    }
}
