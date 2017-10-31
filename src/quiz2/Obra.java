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
public class Obra {
    private String name;
    private String style;
    private String technique;
    private int value;
    private Artista artist;

    public Obra(String name, String style, String technique, int value, Artista artist) {
        this.name = name;
        this.style = style;
        this.technique = technique;
        this.value = value;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return name + ", " + style + ", " + technique + ", " + value;
    }
    
    
}
