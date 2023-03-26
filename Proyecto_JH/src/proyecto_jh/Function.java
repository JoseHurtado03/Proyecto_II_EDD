/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_jh;

/**
 *
 * @author Usuario
 */
public class Function {
    
    /*La función crea un String con todos los autores que aparecen en la HashTable*/
    public String getAllAuthors(HashTable tabla) {
        String info = "";
        for (int i = 0; i < tabla.getSize(); i++) {
            if (tabla.getDocuments()[i] != null) {
                String[] autores_split = tabla.getDocuments()[i].getAuthors().split(",");
                for (int j = 0; j < autores_split.length; j++) {
                    if (!info.contains(autores_split[j])){
                        info += autores_split[j] + "\n";
                    } 
                }
            }
        }
        return info;
    }
    
    /*Recibe un String de los autores y lo convierte en un arreglo, donde cada posición es un autor*/
    public String[] createAuthorsArray(String autores){
        String[] info = autores.split("\n");
        return info;
    }
    
    /*Crea un String con la información de un documento. Recibe la clave única del documento*/
    public String showDocument(HashTable tabla, int index){
        Document doc = tabla.getDocuments()[index];
        if (doc != null) {
            String infoDoc = "Título: " + doc.getTitle() + "\n" + "Autores: " + doc.getAuthors() + "\n";
            return infoDoc;
        }
        return "No hay un elemento con esa clave";
    }
}
