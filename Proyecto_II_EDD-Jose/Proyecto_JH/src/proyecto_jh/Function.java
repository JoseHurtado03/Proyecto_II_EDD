/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_jh;

import javax.swing.JOptionPane;
import java.util.Arrays;

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
    

    
    public Document cargar_documento(String txt1) {
        ListaSimple listautores = new ListaSimple();

        ListaSimple listpalabras_claves = new ListaSimple();

        String ladilla = txt1.replaceAll("Autores", "Ω");
        String ladilla2 = ladilla.replaceAll("Resumen", "Ω");
        String[] devision_info = ladilla2.split("Ω");

        String titulo = devision_info[0];

        String[] info_autores = devision_info[1].split("\n");

        for (int i = 1; i < info_autores.length - 2; i++) {
            listautores.insertarAlFinal(info_autores[i]);
        }

        String[] cuerpo_document = devision_info[2].split("\n");

        String cuerpo = cuerpo_document[1];
//        JOptionPane.showMessageDialog(null, cuerpo);

        String palabras_document = cuerpo_document[cuerpo_document.length - 1];

        String[] palabras_claves1 = palabras_document.split(":");

        String palabras_claves2 = palabras_claves1[palabras_claves1.length - 1];

        String[] palabras_claves3 = palabras_claves2.split(",");

        for (int i = 0; i < palabras_claves3.length; i++) {
            listpalabras_claves.insertarAlFinal(palabras_claves3[i]);
        }

        String autor = listautores.Transformar();
        String palabras_claves = listpalabras_claves.Transformar();

        Document document = new Document(titulo, cuerpo, autor, palabras_claves);
        
        return document;
    }
    
    public void cargar_HashTable(ListaSimple list1, Document document){
        Nodo aux = list1.getpFirst();
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (aux.getDato().equals(document.getTitle())){ 
                encontrado = true;
                break;
            }
            else{
                aux = aux.getPnext();
            }
        }
        
        if(encontrado == false){
            list1.insertarAlFinal(document.getTitle());
            
            JOptionPane.showMessageDialog(null, "cargado");
        }else{
            JOptionPane.showMessageDialog(null, "Ya existe");
        }
    }
    
}
