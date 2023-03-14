public class Book {
    private String title;
    private int pages;
    private String author;
    private String publisher;

    public Book(String title, int pages, String author, String publisher) throws NumberFormatException, RuntimeException {

        if(title==""||author==""||publisher=="") throw new RuntimeException("Uno o più campi vuoti");
        if(pages<=0) throw new RuntimeException("Numero pagine <= 0");
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws RuntimeException {
        if(title=="") throw new RuntimeException("title vuoto");
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) throws NumberFormatException {
        if(pages<=0) throw new RuntimeException("Numero pagine <= 0");
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws RuntimeException {
        if(author=="") throw new RuntimeException("author vuoto");
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws RuntimeException {
        if(publisher=="") throw new RuntimeException("publisher vuoto");
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
