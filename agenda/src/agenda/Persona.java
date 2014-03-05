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
public class Persona {
    
    private String nombre;
    private String domicilio;
    private Lista<String> telefonos= new Lista<String>();
    private Lista<String> correos= new Lista<String>();
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Lista<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Lista<String> telefonos) {
        this.telefonos = telefonos;
    }

    public Lista<String> getCorreos() {
        return correos;
    }

    public void setCorreos(Lista<String> correos) {
        this.correos = correos;
    }
       
}
