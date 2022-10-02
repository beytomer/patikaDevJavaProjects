import java.util.Comparator;

public class Book  {
    private String bookName;
    private int pageNo;
    private String authorName;
    private String releaseDate;

    public Book(String bookName, int pageNo, String authorName, String releaseDate) {
        this.bookName = bookName;
        this.pageNo = pageNo;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


}

