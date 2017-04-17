package example.codeclan.com.movierankings;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String genre;
    private String title;
    private Integer ranking;


    public void Movie(String genre, String title){
        this.genre = genre;
        this.title = title;
        this.ranking = null;
    }

    public String getTitle() {
        return this.title;
    }
}
