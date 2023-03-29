/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_jh;

//Clase para ordenar alfabéticamente los documentos guardados

public class Order {
    
    
    //Procedimiento para crear un Arreglo con documentos
    public String[] createArrayOfDocs(String docs){
        String[] documentos = docs.split("\n");
        return documentos;
    }
    
    //Procedimiento para ordenar 
    public String[] orderAlphabetic(String[] docs){
        String aux;
        int numDocs = docs.length;
        for (int i = 1; i < numDocs; i++) {
            for (int j = 0; j < numDocs-i; j++) {
                if(docs[j].compareTo(docs[j+1]) > 0){
                    //actualizamos las posiciones
                    aux = docs[j];
                    docs[j] = docs[j+1];
                    docs[j+1] = aux;
                }
            }
        }
        return docs;
    }
    
    //Procedimiento para mostrar el array
    public String printNewArray(String[] docs){
        String info = "";
        for (int i = 0; i < docs.length; i++) {
            info += docs[i]+"\n"; 
        }
        return info;
    }
}
