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
            String infoDoc = "Título: " + doc.getTitle() + "\n" + "Autores: " + doc.getAuthors() + "\n" + "Palabras Clave: "+doc.getKeyWords()+"\n";
            return infoDoc;
        }
        return "No hay un elemento con esa clave";
    }
    
    /*Genera un String con la clave y el título de cada documento almacenado en la HashTable*/
    public String showAllDocuments(HashTable tabla){
        String info = "";
        for (int i = 0; i < tabla.getSize(); i++) {
            if (tabla.getDocuments()[i] != null){
                info += i+"- "+tabla.getDocuments()[i].getTitle()+"\n";
            }
        }
        return info;
    }
    
    /*Crea un arreglo de String, donde cada espacio es una palabra clave de un documento*/
    public String[] createKeyArray(String keyWords){
        String[] info = keyWords.split(",");
        return info;
    }
    
    /*Cuenta la cantidad de veces que se repiten las palabras clave dentro de un documento*/
    public String contKeyWords(String[] keyWords, String body){
        String cont = "";
        for (int i = 0; i < keyWords.length; i++) {
            int times = 0;
            String text = keyWords[i];
            for (int j = 0; j < body.length(); j++) {
                if (body.substring(j).startsWith(text)) {
                    times++;
                }
            }
            cont += "La palabra {"+keyWords[i]+"} aparece "+times+" veces en el documento\n";
        }
        return cont;
    }
    
    /*Ordena y crea un String con la información de un documento, para su análisis*/
    public String getInformationToAnalyze(Document doc){
        String information = doc.getTitle().toUpperCase()+"\n \n"+"Autores: "+doc.getAuthors()+"\n \n";
        String[] keys = createKeyArray(doc.getKeyWords());
        information += contKeyWords(keys, doc.getSummaryBody());
        return information;
    }
}
