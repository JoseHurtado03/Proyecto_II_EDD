
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

    public Document searchAuthor(String autor) {
        for (int i = 0; i < table.getDocuments().length; i++) {
            if (table.getDocuments()[i] != null) {
                if (table.getDocuments()[i].getAuthors().contains(autor)) {
                    return table.getDocuments()[i];
                }
            }
        }
        return null;
    }
    
    public Document searchKeyWord(String key){
        for (int i = 0; i < table.getDocuments().length; i++) {
            if (table.getDocuments()[i] != null) {
                if (table.getDocuments()[i].getKeyWords().contains(key)) {
                    return table.getDocuments()[i];
                }
            }
        }
        return null;
    }
    
    /*CONTAR UNA PALABRA DENTRO DE UN STRING*/
//    String randomText = "The sky is blue it meets the sea which is also blue";
//
//        String text = "blue";
//        int times = 0;
//        for (int i = 0; i < randomText.length(); i++) {
//            if (randomText.substring(i).startsWith(text)) {
//                times ++;
//            }
//        }
//        System.out.println(randomText + " contains " + text + " " + times + " times");
}
