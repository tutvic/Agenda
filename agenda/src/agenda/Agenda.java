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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista <String> lisnum = new Lista<>();
        Lista <String> listaco = new Lista<>();
        Persona perso = new Persona();
       
        
        listaco.insertarFinal("victor@redvic.com.mx");
        listaco.insertarFinal("victor@redvic.com");
        listaco.insertarFinal("victor@redvic");
        
        lisnum.insertarFinal("9512286928");
        lisnum.insertarFinal("9512262068");
         
        perso.setNombre("Victor");
        perso.setDomicilio("5 Señores");
        
        perso.setCorreos(listaco);
        perso.setTelefonos(lisnum);
       
        listaco.mostrarLista();
        lisnum.mostrarLista();
        
        VtanaAltas alta = new VtanaAltas();
        lisnum.mostrarLista();
        
       
        
        

    }
    
}
