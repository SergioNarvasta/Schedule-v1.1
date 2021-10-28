package CONTROL;

import MODELO.CONTACTOS;

public class Nodo_Contacto {
    private CONTACTOS elemento;
    private Nodo_Contacto Izq, Der;

    public Nodo_Contacto(CONTACTOS elemento) { 
        this.elemento = elemento;        
        Izq=Der=null;   }

    public CONTACTOS getElemento() { return elemento;}
    
    public void setElemento(CONTACTOS elemento) 
    { this.elemento = elemento;  }

    public Nodo_Contacto getIzq() 
    { return Izq; }
    public void setIzq(Nodo_Contacto Izq)
    {this.Izq = Izq;}

    public Nodo_Contacto getDer()
    {return Der; }
    public void setDer(Nodo_Contacto Der)
    {this.Der = Der; }
    
    

    
    
}
