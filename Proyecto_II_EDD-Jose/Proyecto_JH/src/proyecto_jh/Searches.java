
package proyecto_jh;

public class Searches {
    private HashTable table;

    public Searches(HashTable table) {
        this.table = table;
    }

    /**
     * @return the table
     */
    public HashTable getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(HashTable table) {
        this.table = table;
    }

    public Document searchDoc(int index){
        return table.getDocuments()[index];
    }
    
    /*Recibe el nombre de un autor y retorna la clave y el título de los documentos donde aparece*/
    public String searchAuthor(String autor) {
        String info = "";
        for (int i = 0; i < table.getDocuments().length; i++) {
            if (table.getDocuments()[i] != null) {
                if (table.getDocuments()[i].getAuthors().contains(autor)) {
                    info += i+"-"+table.getDocuments()[i].getTitle()+"\n";
                }
            }
        }
        return info;
    }
    
    public String searchKeyWord(String key){
        String info = "";
        for (int i = 0; i < table.getDocuments().length; i++) {
            if (table.getDocuments()[i] != null) {
                if (table.getDocuments()[i].getKeyWords().contains(key)) {
                    info += i+"-"+table.getDocuments()[i].getTitle()+"\n";
                }
            }
        }
        return info;
    }
}
