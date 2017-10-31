/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.ArrayList;

/**
 *
 * @author @author Oscar Mancera
 */
public class WebGallery {
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> clientes;

    public WebGallery(ArrayList<Artista> artistas, ArrayList<Comprador> clientes) {
        this.artistas = artistas;
        this.clientes = clientes;
    }
    
    public boolean crearCliente(Comprador comprador){
        if(this.clientes.add(comprador))
            return true;
        else
            return false;
        
    }
    
    public boolean crearArtista(Artista artista){
        if(this.artistas.add(artista))
            return true;
        else
            return false;
        
    }
    
    
    
    
    
    
}
