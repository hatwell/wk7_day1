package example.codeclan.com.movierankings;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String genre;
    private String title;
    private Integer ranking;


    public Movie(String title, String genre){
        this.genre = genre;
        this.title = title;
        this.ranking = null;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public Integer getRanking() {
        return this.ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public void addToRanking(){
        int rankingIndex = this.ranking - 1;
        Ranking ranking = new Ranking();
    }


    @Override
    public String toString(){
        return "Title: "+ this.title + " || Genre: " + this.genre + " || Ranking: " + this.ranking;
    }
}
