
import java.util.List;

public class Author {
    private long id;
    private String author_first_name;
    private String author_last_name;
    private List<Album>albums;

    public Author(){}

    public Author(long id, String author_first_name, String author_last_name){
        this.id = id;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
    }

    public Author(long id, String author_first_name, String author_last_name, List<Quote> quotes, List<Album> albums) {
        this.id = id;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;

        this.albums = albums;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
