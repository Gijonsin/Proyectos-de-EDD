
package Clases;

public class ColaEnlazada <T>{
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;
    
    public ColaEnlazada(){
        this.primero=null;
        this.ultimo=null;
        this.tamaño=0;
    }
    
    public boolean colaVacia(){
        if(tamaño == 0)
            return true;
        else
            return false;
    }
    
    public void insertar(T dato){
        Nodo nuevo = new Nodo(dato);
        
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }else{
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
        tamaño++;
            
    }
    
    public T eliminar(){
        T retorno = null;
        if(!colaVacia()){
          
            retorno = (T) primero.getDato();
            primero = primero.getSig();
            tamaño--;
        }
        return retorno;
    }

    public int getTamaño() {
        return tamaño;
    }
    
}
