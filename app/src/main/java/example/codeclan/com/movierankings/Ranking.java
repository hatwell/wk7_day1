package example.codeclan.com.movierankings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] movies;


    public Ranking(){
        this.movies = new Movie[10];

    }

    public void addMovie(Movie movie){
        int movieRankingIndex = movie.getRanking() - 1;
        movies[movieRankingIndex] = movie;
    }

    public Movie[] getMovies(){
        return this.movies;
    }

    public Movie getMovieWithRanking(int ranking){
        int movieIndex = ranking -1;
        return this.movies[movieIndex];
    }

    public Movie findByName(String title){
        for (Movie movie : movies){
            if (movie.getTitle().equals(title))
                return movies;


        }
    }


}
