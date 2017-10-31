/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar Mancera
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista1 =new Artista("Pablo Picasso");
        Obra obra1 = new Obra("Paisaje Mediterraneo", "Cubismo", "Oleo" ,69, artista1);
        Obra obra2 = new Obra("Desnudo y Naturaleza Muerta", "Modernismo", "Oleo", 78, artista1);
        Obra obra3 = new Obra("El Descanso", "Modernismo", "Oleo", 65, artista1);
        artista1.addObra(obra1);
        artista1.addObra(obra2);
        artista1.addObra(obra3);
        WebGallery w = new WebGallery(null, null);
        //w.crearArtista(artista1);
        
        System.out.println(artista1.toString());
        
        //lectura archivo de texto
        String archivo = "info.txt";
        File f = new File(archivo);
        BufferedWriter bw;
        if (f.exists()) {
            try {
                System.out.println("exists returns " + f.exists());
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(artista1.toString());
            } catch (IOException ex) {
                Logger.getLogger(Quiz2.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error en la lectura del archivo");
            }
        } else {
            System.out.println("No existe tal archivo");
            try {
                f.createNewFile();
                System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("No se pudo crear el archivo.");
            }
        }
    }

}
