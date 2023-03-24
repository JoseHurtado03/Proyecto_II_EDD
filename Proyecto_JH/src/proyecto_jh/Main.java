
package proyecto_jh;

import Windows.wMain;

public class Main {

    public static void main(String[] args) {
        /*CREA LA HASHTABLE*/
//        HashTable table = new HashTable();
//        table.initTable();
        
        /*Inserta elementos y muestra su clave (posición de la HashTable donde se insertó)*/
//        Document book = new Document("Harry Potter", "JK Rowling", "Mucho texto", "magia, varita");
//        table.insertDocument(book);
//        Document doc1 = new Document("SOLID", "José H", "Texto", "POO, interfaz");
//        Document doc2 = new Document("Potter Harry", "JK Rowling", "Más texto", "Hogwarts, magia");
//        table.insertDocument(doc1);
//        table.insertDocument(doc2);
//        
//        /*Imprime la HashTable (Solo para mostrar las funciones de arriba)*/
//        String tablita = table.printHash();
//        System.out.println(tablita);
//
        /*Realiza búsquedas por Autor y Palabra Clave e imprime el resultado de la búsqueda*/
//        Searches search = new Searches(table);
//        String doc = search.searchAuthor("JK Rowling");
//        String docu = search.searchKeyWord("magia");
//        System.out.println(doc);
//        System.out.println(docu);

        /*Interfaces modelo del programa (sirven de molde)*/
        wMain window = new wMain();
        window.setVisible(true);
    }

}
