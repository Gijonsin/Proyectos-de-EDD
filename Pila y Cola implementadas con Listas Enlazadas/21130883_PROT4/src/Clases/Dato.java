
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;

public class Dato {
    private int numero;
    private String nombre;
    private double costo;
    
    public Dato (){
        this.numero=0;
        this.nombre="";
        this.costo=0.0;
    }

    public Dato(int numero, String nombre, double costo) {
        this.numero = numero;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    //Aleatorio
    public void aleatorio(JTable tabla){
        Random azar = new Random();
        
        String []nombre = {"Mouse","Laptop","Teclado","Monitor","CPU","DD","RAM","Caché"};
        
        tabla.setValueAt(azar.nextInt(100)+1, 0, 0);
        tabla.setValueAt(nombre[azar.nextInt(nombre.length)], 0, 1);
        DecimalFormat formato = new DecimalFormat("#.#");
        tabla.setValueAt(formato.format(azar.nextInt(10000)+azar.nextDouble()), 0, 2);
       
    }
    
    //Lo contrario de mostrar por renglon aqui se muestra por clumna
    public void mostrarDatoPila(JTable tabla, int reng){
        
        tabla.setValueAt(this.numero, reng, 0);
        tabla.setValueAt(this.nombre, reng, 1);
        tabla.setValueAt(this.costo, reng, 2);
        
    }
    //Lo contrario de mostrar por renglon aqui se muestra por clumna
    public void mostrarDatoCola(JTable tabla, int col){
        
        tabla.setValueAt(this.numero, 0, col);
        tabla.setValueAt(this.nombre, 1, col);
        tabla.setValueAt(this.costo, 2, col);
        
    }
}
