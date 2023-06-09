
package proyecto_jh;

import javax.swing.JOptionPane;

public class HashTable {
    private int size;
    private Document[] documents;

    public HashTable() {
        this.size = 20;
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
    
    /*Función hash que genera una clave única a partir de el nombre de un documento*/
    public int hashFunction(Document document){
        String title = document.getTitle();
        int index = 0;
        for (int i = 0; i < title.length(); i++) {
            index += title.codePointAt(i);
        }
        index = index % this.getSize();
        return index;
    }
    
    /*Inserta en la HashTable un documento en la posición que indique la clave única*/
    public void insertDocument(Document document){
        if (!isInHash(document)) {
            int index = hashFunction(document);
            while (getDocuments()[index] != null) {
                index++;
            }
            JOptionPane.showMessageDialog(null, "La clave del Documento " + document.getTitle() + " es: " + index);
            getDocuments()[index] = document;
        } else{
            JOptionPane.showMessageDialog(null, "¡ERROR!\nEl documento ya está registrado");
        }
    }
    
    /*Verifica si un documento ya existe en la HashTable*/
    public boolean isInHash(Document doc){
        boolean aux = false;
        for (int i = 0; i < this.getDocuments().length; i++) {
            if (getDocuments()[i] != null){
                if (getDocuments()[i].compareDocuments(doc)){
                    aux = true;
                }
            }
        }
        return aux;
    }
}
