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
public class Artista extends Usuario{
    private ArrayList<Obra> paints;
    

    public Artista(String name) {
        super(name);
        this.paints = new ArrayList<>();
    }

    public ArrayList<Obra> getPaints() {
        return paints;
    }

    public void setPaints(ArrayList<Obra> paints) {
        this.paints = paints;
    }
    
    public boolean addObra(Obra obra){
        if(this.paints.add(obra))
            return true;
        else
            return false;
        
    }

    @Override
    public String toString() {
        String aux = "";
        aux += super.toString() + ", " + paints.size() + "\n";
        for(Obra obra : paints)
            aux += obra.toString()+ "\n";
        return aux;
    }
    
    
}
