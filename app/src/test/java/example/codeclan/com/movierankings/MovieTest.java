package example.codeclan.com.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {
    Movie movie;

    @Before
    public void before(){
    movie = new Movie("Clueless", "Classics");
    }

    @Test
    public void movieHasTitleTest(){
        assertEquals("Clueless", movie.getTitle());
    }

    @Test
    public void movieHasGenreTest(){
        assertEquals("Classics", movie.getGenre());
    }

    @Test
    public void rankingStartsNull(){
        assertEquals(null, movie.getRanking());
    }

    @Test
    public void rankingCanBeSet(){
        movie.setRanking(1);
        assertEquals(1, movie.getRanking());
    }
}
