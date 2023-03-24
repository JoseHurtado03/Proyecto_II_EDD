
package proyecto_jh;

public class Document {
    private String title;
    private String authors;
    private String summaryBody;
    private String keyWords;

    public Document(String title, String authors, String summaryBody, String keyWords) {
        this.title = title;
        this.authors = authors;
        this.summaryBody = summaryBody;
        this.keyWords = keyWords;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * @return the summaryBody
     */
    public String getSummaryBody() {
        return summaryBody;
    }

    /**
     * @param summaryBody the summaryBody to set
     */
    public void setSummaryBody(String summaryBody) {
        this.summaryBody = summaryBody;
    }

    /**
     * @return the keyWords
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * @param keyWords the keyWords to set
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    
    public boolean compareDocuments(Document document){
        return document.getTitle().equalsIgnoreCase(this.title) && document.getAuthors().equalsIgnoreCase(this.authors);
    }
}
