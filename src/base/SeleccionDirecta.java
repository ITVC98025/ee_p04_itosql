package base;
public class SeleccionDirecta <T extends Comparable<T>>
{
   
    public SeleccionDirecta()
    {
       
    }

    public T[] seleccion(T[] arreglo){    
        int j,k,i;
        T menor;
        for(i=0;i<arreglo.length-1;i++){
            menor=arreglo[i];
            k=i;
            for(j=i+1;j<arreglo.length;j++){
                int x=arreglo[j].compareTo(menor);
                if(x<0){
                    menor=arreglo[j];
                    k=j;
                }
            }
            arreglo[k]=arreglo[i];
            arreglo[i]=menor;
        }
        return arreglo;
    }   
}
