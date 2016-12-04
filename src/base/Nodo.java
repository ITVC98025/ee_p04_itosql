/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 * CLASE NODO MODIFICADO PARA EL PROYECTO BASE DE DATOS 
 * SE LE SUMO UN DATO DE TIPO LISTA LIGADA EL CUAL CONTIENE LOS VALORES 
 * DATO
 * @author alejandro
 */
public class Nodo<T>{
/**
 * 
 * inicializamos las variables dato (que contendra la informacion)
 * y la variable nodo de tipo nodo para guardar el dato
 * 
 */
    private T dato;
    private Nodo<T> siguiente;
     private Listasimple datos=new Listasimple();
    
    
/**
 *
 * constructor por defecto
 */
 public Nodo(){
   siguiente=null;
 }
 
 /**
  * le pasamos un dato al nodo 
  */
 public Nodo(T p){
  siguiente=null;
  dato=p;
 }
 
 /**
  * le pasamos un dato y su siguiente nodo al nodo 
     * @param t dato
     * @param siguiente nodo
  */
 
 public Nodo(T t, Nodo<T> siguiente){
  this.siguiente=siguiente;
  dato=t;
 }




    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Listasimple<T> getLista() {
        return datos;
    }

    public void setLista(Listasimple<T> lista) {
        this.datos = lista;
    }
    
 
    
    
}


