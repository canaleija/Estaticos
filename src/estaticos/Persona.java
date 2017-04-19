/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Persona {
       
        private String nombre;
        private String dom;
        private int edad;
        private static int num_instancias = 0;

    public Persona(String nombre, String dom, int edad) {
        this.nombre = nombre;
        this.dom = dom;
        this.edad = edad;
        this.num_instancias++;
    }
        
    public static void setNumInstancias(int valor){
        num_instancias = valor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
        
    
    
    
}
