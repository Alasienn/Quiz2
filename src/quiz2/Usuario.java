/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author @author Oscar Mancera
 */
public abstract class Usuario {
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
