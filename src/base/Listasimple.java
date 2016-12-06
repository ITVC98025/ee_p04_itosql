
package base;

/**
 * CLASE ADECUADA PARA EL PROYECTO SQL ITO
 * @author alejandro
 */
import java.io.IOException;

public class Listasimple<T> {
   Nodo inicio;
   Nodo fin;
   Nodolista iniciolista;
   Nodolista finlista;
   int size=0;
  
   public Listasimple(){
    inicio = null;
    fin=null;
   }
   
 public boolean estavacia(){
 return (inicio==null)?true:false;
 }
   
 /**
  * agrega un elemento al inicio de la lista
  * @param dato el valor que va a tener nuestro nodo
  */
 
 public void agregar_inicio(T dato){
  if(inicio == null){
      inicio=new Nodo(dato);
  }
  else{
    Nodo temp = inicio;
   
    Nodo nuevo=new Nodo(dato);
    nuevo.setSiguiente(temp);
    inicio=nuevo;
  }
  size++;
 }
  public int size(){
  return size;
  }
 /**
  * el metodo muestra el elemento que se requiere de la lista
  * @param index posicion del elemento que quiero obtener
  * @return el elemento seleccionado
  */ 
 public T obtener(int index){
  int contador=0;
  Nodo temporal=inicio;
  while(contador<index){
   temporal=temporal.getSiguiente();
   contador++;
  }
  return (T) temporal.getDato();
 }
/**
 * 
 * @return el nodo inicial
 */
 public Nodo<T> inicio() {
        return inicio;
    }
 /**
  * este metodo elimina el primero(ultimo dato ingresado)de la lista
  */
 public void eliminarprimero(){
 inicio=inicio.getSiguiente();
 size--;
 
 }
 /**
  * metodo para agregar al final
  */
 public void agregarfinal(T dato){
 Nodo nuevo=new Nodo(dato,null);
 if(inicio==null){
 fin=nuevo;
 inicio=fin;
 }
 else{
 fin.setSiguiente(nuevo);
 fin=nuevo;
 }
 size++;
 }
 /*
 METODO IMPLEMENTADO PARA AGREGAR AL FINAL UNA LISTA EN LUGAR
 DE UN DATO
 */
 public void agregarfinalista(Listasimple<T> lista,String n){
 Nodolista nuevo=new Nodolista(lista,null,n);
 if(iniciolista==null){
 finlista=nuevo;
 iniciolista=finlista;
 }
 else{
 finlista.setSiguiente(nuevo);
 finlista=nuevo;
 }
 size++;
 }
 
 /**
  * este metodo elimina un elemento en la posicion dada
  */
 public void eliminar(int index){
 if(index==0){
   inicio=inicio.getSiguiente();
 }
 else{
    int contador=0;
    Nodo aux=inicio;
    while(contador<index-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 size--;
 }
 /*
 METODO ELIMINAR CON NODOLISTAS
 */
 public void eliminarl(int index){
 if(index==0){
   iniciolista=iniciolista.getSiguiente();
 }
 else{
    int contador=0;
    Nodolista aux=iniciolista;
    while(contador<index-1){
     aux=aux.getSiguiente();
     contador++;
    }
   aux.setSiguiente(aux.getSiguiente().getSiguiente());
  }
 size--;
 }
 /**
  * metodo donde elimina el ultimo elemento de la lista
  */
 public void eliminarultimo(){
 int contador=0;
 Nodo aux=inicio;
 while(contador<size-2){
  aux=aux.getSiguiente();
  contador++;
 }
 aux.setSiguiente(null);
 size--;
 if(size==0){
     inicio=null;
 }
 }

 /**
  * metodo que recorre e imprime todos los elementos de la lista
  */
 public void recorrer(){
 int cont =0;
 Nodo aux=inicio;
   while(cont<size){
     System.out.print("-"+aux.getDato());
     aux=aux.getSiguiente();
     cont++;
   }
 }
 
 /*
 METODO QUE RECORRE UNA LISTA QUE SE ENCUENTRA DENTRO DE OTRA LISTA
 */
 public void recorrerlista(){
 int cont =0;
 Nodolista aux=iniciolista;
   while(cont<size){
     System.out.println(aux.getNombre());
     aux.getLista().recorrer();
     
     System.out.println();
     aux=aux.getSiguiente();
     cont++;
   }
 }
 /*
 RECIBE COMO PARAMETRO UN STRING Y SOBRE ESE REALIZA UNA BUSQUEDA
 EN LA LISTA DE NODOS
 */
public Nodo buscarcadena(String cadena){
 int cont =0;
 Nodo aux=inicio;
 Nodo indice=null;
 boolean b=false;
   while(cont<size){
      int x=cadena.compareTo((String) aux.getDato());
     if(x == 0){
         //System.out.println("\n"+cont);
         indice=aux;
         //eliminar(cont);
         //System.out.println(aux.getDato());
         b=true;
         }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNO EXISTE ESE DATO");
  }
  //System.out.println(indice.getDato()+""+indice.getSiguiente().getDato());
  return indice;
}
/*
METODO BUSCA Y ELIMINA CON LISTA
*/
public void buscayelimina(String cadena){
 int cont =0;
 Nodolista aux=iniciolista;
 boolean b=false;
 while(cont<size){
      int x=cadena.compareTo((String) aux.getNombre());
      if(x == 0){
         //System.out.println("\n"+cont);
         eliminarl(cont);
         //System.out.println(aux.getDato());
         b=true;
         }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNO EXISTE ESE DATO");
  }
  //System.out.println(indice.getDato()+""+indice.getSiguiente().getDato());
  
}
/*
RECIBE COMO PARAMETRO UN STRING Y BUSCA ENTRE UNA LISTA DE LISTAS EL
DATO NOMBRE QUE COINCIDA
*/
 public Nodolista buscartabla(String cadena){
 int cont =0;
 Nodolista aux=iniciolista;
 Nodolista indice=null;
 boolean b=false;
   while(cont<size){
      int x=cadena.compareTo((String) aux.getNombre());
     if(x == 0){
         //System.out.println("\n"+cont);
         indice=aux;
         //eliminar(cont);
         //System.out.println(aux.getNombre());
         b=true;
         }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNO EXISTE ESA TABLA");
  }
  //System.out.println(indice.getDato()+""+indice.getSiguiente().getDato());
  return indice;
}
/*
 METODO BUSCA Y ELIMINA
 */
 public void buscarydestruir(String cadena){
 int cont =0;
 Nodo aux=inicio;
 boolean b=false;
   while(cont<size){
      int x=cadena.compareTo((String) aux.getDato());
     if(x == 0){
         eliminar(cont);
         b=true;
         }
     aux=aux.getSiguiente();
     cont++;
   }
  if(b==false){
    System.out.println("\nNO EXISTE ESE CAMPO");
  }
  
}
 /*
 METODO DE DIEGO 
 */
 public String transString(){
	    Nodo<T> temporal = inicio;
    	String s = "";
    	while(temporal != null){
    		s += temporal.getDato() + ",";
    		temporal = temporal.getSiguiente();
    	}
    	s += "null";
		return s;
	}
 public static void main(String args[])throws IOException{
    /**
     * pruebas para clase lista
     */
    Listasimple lista=new Listasimple();
   lista.agregarfinal("pedro");
   lista.agregarfinal("juan");
   lista.agregarfinal("alicia");
   lista.agregarfinal("reynita");
   lista.recorrer();
   lista.buscarcadena("juan");
   
 }
}