
package base;

/**
 *CLASE NODOLISTA LA CUAL EN LUGAR DE RECIBIR COMO DATO UN STRING RECIBE
 * UNA LISTA LIGADA
 * @author alejandro
 */
    public class Nodolista<T>{
/**
 * 
 * inicializamos las variables dato (que contendra la informacion)
 * y la variable nodo de tipo nodo para guardar el dato
 * 
 */
    private Listasimple<T> lista;
    private Nodolista<T> siguiente;
    private String nombre="";
    
    
 public Nodolista(){
   siguiente=null;
 }
 
 /**
  * le pasamos un dato al nodo 
     * @param p
  */
 public Nodolista(Listasimple<T> p){
  siguiente=null;
  lista=p;
 }
 
 /**
  * le pasamos un dato y su siguiente nodo al nodo 
     * @param t dato
     * @param siguiente nodo
  */
 
 public Nodolista(Listasimple<T> p, Nodolista<T> siguiente,String n){
  this.siguiente=siguiente;
  lista=p;
  nombre=n;
 }

    public Listasimple<T> getLista() {
        return lista;
    }

    public void setLista(Listasimple<T> lista) {
        this.lista = lista;
    }

    public Nodolista<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodolista<T> siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
