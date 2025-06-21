public class Book {
    private int bookid;
    private String title;
    private String author;
    public Book(int bookid,String title,String author){
        this.bookid=bookid;
        this.title=title;
        this.author=author;
    }
    public int getBookid() {return bookid;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}

    public String toString() {
        return "Book(" + bookid + ", '" + title + "', '" + author + "')";
    }

}
