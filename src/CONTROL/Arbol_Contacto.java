package CONTROL;

import MODELO.CONTACTOS;
import javax.swing.table.DefaultTableModel;

public class Arbol_Contacto {
    
    private Nodo_Contacto Raiz;
    public Arbol_Contacto(){ Raiz = null;}
    
    public void setRaiz(Nodo_Contacto Raiz){this.Raiz= Raiz;}
    public Nodo_Contacto getRaiz(){return Raiz;}
    
    public Nodo_Contacto Agregar(Nodo_Contacto Nodo,CONTACTOS Elemento){
        if (Nodo == null) {
            Nodo_Contacto Nuevo = new Nodo_Contacto(Elemento);
            return Nuevo; }
        else{
            if (Nodo.getElemento().getCod().compareTo(Elemento.getCod())<0) {
                Nodo.setDer(Agregar(Nodo.getDer(), Elemento));
            }else{
             Nodo.setIzq(Agregar(Nodo.getIzq(), Elemento)); }
        }
        return Nodo;
    }
    
    public Nodo_Contacto BuscarCod(String Dato){
        Nodo_Contacto Auxiliar = Raiz;
        while (Auxiliar != null) {
            if(Auxiliar.getElemento().getCod().startsWith(Dato)){
            return Auxiliar;}
            else{ 
                if(Dato.compareTo(Auxiliar.getElemento().getCod())>0)
                Auxiliar = Auxiliar.getDer();
              else
                Auxiliar = Auxiliar.getIzq();
            }
        }
        return null;
    }
    
    public void Listar_InOrden(DefaultTableModel modTabla, Nodo_Contacto Nodo){
        if(Nodo != null){
            Listar_InOrden(modTabla, Nodo.getIzq());
            modTabla.addRow(Nodo.getElemento().getRegistro());
            Listar_InOrden(modTabla, Nodo.getDer());
        }
    }
    public Nodo_Contacto BuscarMayorIzquierda(Nodo_Contacto Auxiliar){
        if (Auxiliar != null)
        { while (Auxiliar.getDer() != null)
        { Auxiliar = Auxiliar.getDer();  }
        }
        return Auxiliar;
    }
    public Nodo_Contacto EliminarMayorIzquierda(Nodo_Contacto Auxiliar){
        if (Auxiliar == null)
            return null;
        else if (Auxiliar.getDer() != null) {
             Auxiliar.setDer(EliminarMayorIzquierda(Auxiliar.getDer()));
             return Auxiliar;   }
        return Auxiliar.getIzq();}
    
    public Nodo_Contacto Eliminar(Nodo_Contacto Auxiliar, String Dato){
        if(Auxiliar == null)            return  null;
        
        if(Dato.compareTo(Auxiliar.getElemento().getCod())<0){
            Auxiliar.setIzq(Eliminar(Auxiliar.getIzq(), Dato));        }
        
        else if(Dato.compareTo(Auxiliar.getElemento().getCod())>0){
            Auxiliar.setDer(Eliminar(Auxiliar.getDer(), Dato));        }
        
        else if(Auxiliar.getIzq() != null && Auxiliar.getDer() != null){
           Auxiliar.setElemento(BuscarMayorIzquierda(Auxiliar.getIzq()).getElemento());
           Auxiliar.setIzq(EliminarMayorIzquierda(Auxiliar.getIzq()));}
        
        else{
           Auxiliar =(Auxiliar.getIzq() != null)? Auxiliar.getIzq() : Auxiliar.getDer(); }
           return Auxiliar;}

    
}
