package example.codeclan.com.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Ranking ranking;
    Movie movie;

    @Before
    public void before(){
        ranking = new Ranking();
        movie = new Movie("Koyaanisqatsi", "Silent");
        movie.setRanking(6);
    }

    @Test
    public void movieInRankingTest(){
        ranking.addMovie(movie);
        assertEquals(ranking.getMovies()[5], movie);
    }

    @Test
    public void getMovieAtRankingTest(){
        ranking.addMovie(movie);
        assertEquals(movie,ranking.getMovieWithRanking(6));
    }
}
