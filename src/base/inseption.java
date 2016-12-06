
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
    METODO EL CUAL VACIA EN UN ARREGLO LOS DATOS DE LAS  LISTAS 
    PARA SU ORDENACION
    */
    public String[][] vaciar(String tabla){
    Nodolista aux=tablas.buscartabla(tabla); 
    Nodo l=aux.getLista().inicio;
    String datos[][]=new String [l.getLista().size()+1][aux.getLista().size()];
    int cam=0;int dat=1;
    Nodo d=null;
    System.out.println("\nTABLA :"+aux.getNombre());
    
    while(l!=null){
    //System.out.print("\ncampo :"+l.getDato());
        datos[0][cam]=(String) l.getDato();
        d=l.getLista().inicio;
        while(d!=null){
         //System.out.print("  dato :"+d.getDato());
         datos[dat][cam]=(String)d.getDato();
         d=d.getSiguiente();
         dat++;
      }
      l=l.getSiguiente();
      cam++;
      dat=1;
     }
    //System.out.println(); 
    //for (int i = 0; i <datos.length; i++) { 
            //for (int j = 0; j <datos[i].length; j++) {
                //System.out.print(datos[i][j] + " ");
            //}
         //System.out.println();
    //}
    return datos;
    }
    /*
    METODO QUE REGRESA EL NOMBRE DE LAS LISTAS EN UN ARREGLO
    */
    public String[] rtablas(){
     Nodolista aux=tablas.iniciolista;
     String tab[]=new String[tablas.size()];
     int cont=0;
     while(aux!=null){
     System.out.println("\nTABLA :"+aux.getNombre());
     tab[cont]=aux.getNombre();
     aux=aux.getSiguiente();
     cont++;
     }
     return tab;
    }
    /*
    METODO QUE REGRESA LOS CAMPOS EN UN String
    */
    public String[] rcampos(String tabla){
     Nodolista aux=tablas.buscartabla(tabla);
     Nodo l=aux.getLista().inicio;
     String tab[]=new String[aux.getLista().size()];
     int cont=0;
     while(l!=null){
     System.out.println("\ncampo :"+l.getDato());
     tab[cont]=(String) l.getDato();
     l=l.getSiguiente();
     cont++;
     }
     return tab;
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
     
     }
     else{JOptionPane.showMessageDialog(null,"CAMPO INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
     }
     else{JOptionPane.showMessageDialog(null,"TABLA INEXISTENTE",
            "FALLO",JOptionPane.INFORMATION_MESSAGE);}
    } 
    /*
    METODO ENCARGADO DE ELIMINAR CAMPOS DE LAS TABLAS
    */
    public void eliminarcampos(String tabla,String campo){
     Nodolista aux=tablas.buscartabla(tabla);
     aux.getLista().buscarydestruir(campo);
     JOptionPane.showMessageDialog(null,"CAMPO "+campo+" ELIMINADO",
            "EXITO",JOptionPane.INFORMATION_MESSAGE);
     
    }
    public String[][] prueba(){
     String [][]t=new String [4][3];
     t[0][0]="ID";t[0][1]="NOMBRE";t[0][2]="EDAD";
     t[1][0]="423"; t[1][1]="PEDRO"; t[1][2]="13";
     t[2][0]="3456";t[2][1]="GINA";t[2][2]="34";
     t[3][0]="6345";t[3][1]="VALE";t[3][2]="1";
     return t;
    }
    /*
    METODO que regresa los nombres de los campos
    */
    public Listasimple regresacampos(String [][]dat){
    Listasimple campos=new Listasimple();
    for(int d=0;d<dat[0].length;d++){
      campos.agregarfinal(dat[0][d]);
    }
    campos.recorrer();
    System.out.println();
    return campos;
    } 
    /*
    METODO QUE REGRESA TODOS LOS DATOS CONCATENADOS EN LISTAS
    String [][]dat
    */
    public Listasimple regresadatos(String [][]dat){   
    Listasimple datos=new Listasimple();
    for(int d=1;d<dat.length;d++){
        for(int j=0;j<dat[d].length;j++)
        {
          datos.agregarfinal(dat[d][j]);
        }
    }
    datos.recorrer();
    return datos;
    } 
   
   public static void main(String args[])throws IOException{
    /**
     * pruebas para clase lista
     */
    inseption base=new inseption();
    //base.regresacampos();
    //base.regresadatos();
    
 } 
}
