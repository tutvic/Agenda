/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_nodos;

/**
 *
 * @author Victor
 */
public class pilas<T> {

    private Nodo<T> p;

    pilas() {
        this.p = null;
    }

    public void push(T dato) {
        Nodo<T> t = new Nodo<>(dato);
        if (p == null) {
            p = t;
        } else {
            t.setLiga(p);
            p = t;
        }
    }

    public void pop() {
        if (p == null) {
            System.out.println("Pila Vacia");
        } else {
            System.out.println(p.getValor());
            p = p.getLiga();
        }
    }

}
