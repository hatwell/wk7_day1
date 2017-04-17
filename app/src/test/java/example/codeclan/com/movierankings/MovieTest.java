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
    public void movieHasTitle(){
        assertEquals("Clueless", movie.getTitle());
    }
}
