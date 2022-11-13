
package Clases;

import javax.swing.JOptionPane;

public class PilaEnlazada <T>{
    private Nodo ultimo;
    private int tamaño;
    
    public PilaEnlazada(){
        ultimo = null;
        tamaño = 0;
    }
    
    public boolean pilaVacia(){
        if(this.tamaño==0)
            return true;
        else
            return false;
    }

    public int getTamaño() {
        return tamaño;
    }
     
    public void push(T dato){
        
        if(ultimo==null){
            Nodo nuevo = new Nodo(dato);
            
            ultimo = nuevo;
            this.tamaño++;
        }else{
            Nodo nuevo = new Nodo(dato,ultimo);
            ultimo = nuevo;
            tamaño++;
        }
        
    }
    
    public T pop(){
        T retorno = null;
        if(!pilaVacia()){
            
            retorno = (T) ultimo.getDato();
            ultimo = ultimo.getSig();
            tamaño--;
            
        }else
            JOptionPane.showMessageDialog(null, "La pila esta vacia!!!");
        return retorno;
    }
    
    
}
