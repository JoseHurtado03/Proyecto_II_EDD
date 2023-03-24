
package proyecto_jh;

import javax.swing.JOptionPane;

public class HashTable {
    private int size;
    private Document[] documents;

    public HashTable() {
        this.size = 50;
        this.documents = new Document[size];
    }
    
    
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the documents
     */
    public Document[] getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }
    
    public void initTable(){
        setDocuments(new Document[getSize()]);
        for (int i = 0; i < size; i++) {
            getDocuments()[i] = null;
        }
    }
    
    public int hashFunction(Document document){
        String title = document.getTitle();
        int index = 0;
        for (int i = 0; i < title.length(); i++) {
            index += title.codePointAt(i);
        }
        index = index % this.getSize();
        return index;
    }
    
    public void insertDocument(Document document){
        int index = hashFunction(document);
        while (getDocuments()[index] != null){
            index++;
        }
        JOptionPane.showMessageDialog(null, "La clave del Documento "+document.getTitle()+" es: "+index);
        getDocuments()[index] = document;
    }
    
    public String printHash(){
        String info = "";
        for (int i = 0; i < getSize(); i++) {
            if (getDocuments()[i] != null) {
                info += i+"- Título: " + getDocuments()[i].getTitle() + " Autor: " + getDocuments()[i].getAuthors() + "\n";
            }else{
                info += i+"- NULL\n";
            }
        }
        return info;
    }

}
