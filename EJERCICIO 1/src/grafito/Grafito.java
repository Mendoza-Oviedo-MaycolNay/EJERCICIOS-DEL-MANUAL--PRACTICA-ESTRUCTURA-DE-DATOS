/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafito;

/**
 *
 * @author Mendoza
 */
public class Grafito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(5);
        
        matriz.agregar(0, 1);
        matriz.agregar(0, 1);
        matriz.agregar(0, 2);
        matriz.agregar(0, 3);
        
        matriz.agregar(1, 0);
        matriz.agregar(1, 0);
        matriz.agregar(1, 4);
        
        matriz.agregar(2, 0);
        matriz.agregar(2, 3);
        matriz.agregar(2, 4);
        
        matriz.agregar(3, 0);
        matriz.agregar(3, 2);
        
        matriz.agregar(4, 1);
        matriz.agregar(4, 2);
        matriz.agregar(4, 4);
        matriz.agregar(4, 4);
        
        matriz.imprimir();
    }
    }
    

