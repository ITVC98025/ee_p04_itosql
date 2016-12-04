
package base;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * CLASE INSEPTION LA CUAL REALIZA TODO EL TRABAJO 
 * EN ELLA SE CREAN LISTAS QUE A SU VEZ CONTIENEN MAS LISTAS
 * Y ASI SUCESIVAMENTE
 * @author alejandro
 */
public class inseption {
    Listasimple tablas=new Listasimple();
    Listasimple campos=new Listasimple();
    
    /*
    METODO PARA AGREGAR UN CAMPO PARA UNA LISTA LLAMADA DE LA MISMA FORMA
    */
    public void agregarcampo(String campo){
      campos.agregarfinal(campo);
    }
    
    /*
    ESTE METODO RECIBE COMO PARAMETRO UN DATO DE TIPO STRING EL CUAL 
    FUNGE COMO NOMBRE DE NUESTRA TABLA AQUI INSERTAMOS UNA LISTA LIGADA 
    ENTRE OTRA Y LA VACIAMOS PARA SU PROXIMO USO
    */
    public void creartabla(String n){
      
    tablas.agregarfinalista(campos,n);
    campos=new Listasimple();
    JOptionPane.showMessageDialog(null,"TABLA "+n+" CREADA",
            "EXITO",JOptionPane.INFORMATION_MESSAGE);
    }
     
   
   /*
    METODO PARA IMPRIMIR LA LISTA CON TODOS SUS NODOS
    */
    public void imprimir(){
     Nodolista aux=tablas.iniciolista; 
     Nodo l=null;
     Nodo n=null;
     while(aux!=null){
     System.out.println("\nTABLA :"+aux.getNombre());
     l=aux.getLista().inicio;
     while(l!=null){
      System.out.print("campo :"+l.getDato());
      l.getLista().recorrer();
      System.out.println();
      l=l.getSiguiente();
     }
     aux=aux.getSiguiente();
     }
     //tablas.recorrerlista();
    }
    
    /*
    METODO PARA ELIMINAR UNA TABLA
    */
    
    public void eliminartabla(String tabla){
      tablas.buscayelimina(tabla);
      JOptionPane.showMessageDialog(null,"TABLA "+tabla+" ELIMINADA",
            "AVISO",JOptionPane.INFORMATION_MESSAGE);
    }
    /*
    METODO ADECUADO PARA EL INGRESO DE DATO HACIA UNA TABLA
    SE PIDE TRES DATOS LA TABLA, EL CAMPO Y EL DATO QUE DESEA AGREGAR 
    */
    public void agregardatos(String tabla,String campo,String dato){
     Nodolista aux=tablas.buscartabla(tabla);
     if(aux!=null){
     Nodo l=aux.getLista().buscarcadena(campo);
     if(l!=null){
     l.getLista().agregarfinal(dato);
     JOptionPane.showMessageDialog(null,"DATO AGREGADO",
            "EXITO",JOptionPane.INFORMATION_MESSAGE);
     }
     else{JOptionPane.showMessageDialog(null,"CAMPO INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
     }
     else{JOptionPane.showMessageDialog(null,"TABLA INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
    } 
    
   public static void main(String args[])throws IOException{
    /**
     * pruebas para clase lista
     */
    inseption base=new inseption();
    base.agregarcampo("nombre");
    base.agregarcampo("id");
    base.agregarcampo("edad");
    base.agregarcampo("sexo");
    base.creartabla("");
    
    base.agregarcampo("nombre");
    base.agregarcampo("id");
    base.agregarcampo("edad");
    base.agregarcampo("sexo");
    base.creartabla("profesor");
    
    //base.imprimir();
    base.eliminartabla("alumno");
   
    //base.agregardatos("alumno","nombre","reyna");
    //base.agregardatos("alumno","sexo","f");
    //base.agregardatos("alumno","casado","f");
    //base.agregardatos("profesor","casado","si");
    base.imprimir();
    
 } 
}
