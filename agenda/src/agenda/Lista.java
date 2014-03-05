/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda;

/**
 *
 * @author Victor
 */
public class Lista <T>{
    
        private Nodo<T> p = null;
        
        
    public void insertarFinal(T dato) {
        //variable auxiliar
        Nodo<T> q = p; // el nodo auxiliar para recorrer la lista
        Nodo<T> t = new Nodo<>(dato); // el nuevo nodo a insertar 

        t.setValor(dato);
        t.setLiga(null);

        if (p == null) {
            p = t;
        } else {
            while (q.getLiga() != null) {
                q = q.getLiga();
            }
            q.setLiga(t); // asignamos a la liga del ultimo elemento, el nuevo elemento  
        }
    }

    public void mostrarLista() {
        //variable auxiliar 
        Nodo<T> q = p;

        //ciclo que recorra la lista
        while (q != null) {
            System.out.println(q.getValor());
            q = q.getLiga();
        }
    }
    
}
