/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticos;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Estaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Persona("alejandra", "Calle Alejandra, col Alejandra", 34));
        listaAlumnos.add(new Persona("alejandra2", "Calle Alejandra, col Alejandra", 34));
        listaAlumnos.add(new Persona("alejandra3", "Calle Alejandra, col Alejandra", 34));
        listaAlumnos.add(new Persona("Martin alejandro", "Calle Alejandra, col Alejandra", 34));
         
        for (Persona persona:listaAlumnos){
        System.out.println(persona.getNombre());
        
        }
    
    }
    
}
