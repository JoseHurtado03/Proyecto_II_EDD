
package proyecto_jh;

import javax.swing.JOptionPane;

public class HashTable {
    private final int size;
    Document[] documents;

    public HashTable() {
        this.size = 50;
        this.documents = new Document[size];
    }
    
    public void initTable(){
        documents = new Document[size];
        for (int i = 0; i < 10; i++) {
            documents[i] = null;
        }
    }
    
    public int hashFunction(Document document){
        String title = document.getTitle();
        int index = 0;
        for (int i = 0; i < title.length(); i++) {
            index += title.codePointAt(i);
        }
        index = index % this.size;
        return index;
    }
    
    public void insertDocument(Document document){
        int index = hashFunction(document);
        while (documents[index] != null){
            index++;
        }
        JOptionPane.showMessageDialog(null, "La clave del Documento "+document.getTitle()+" es: "+index);
        documents[index] = document;
    }
    
    public String printHash(){
        String info = "";
        for (int i = 0; i < size; i++) {
            if (documents[i] != null) {
                info += i+"- Título: " + documents[i].getTitle() + " Autor: " + documents[i].getAuthors() + "\n";
            }else{
                info += i+"- NULL\n";
            }
        }
        return info;
    }
}
