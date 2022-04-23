import static org.junit.Assert.*;
import org.junit.Test;

public class VectorsTest {
    @Test
    public void threeForcesAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void threeForcesNotAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{4, 1, 7}, {-2, 4, -1}, {1, -5, -3}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void fourForcesOfValueZero(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{0,0,0}, {0,0,0}, {0,0,0}, {0,0,0}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void fourForcesInNegativeDirection(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{-3,-1, -7}, {-5, -6, -4}, {-2, -1, -3}, {-7,-
                8,-9}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void fourForcesInPositiveDirection(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,1, 7}, {5, 6, 4}, {2, 1, 3}, {7,8,9}};
        assertEquals("No", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void fiveForcesAtEquilibrium(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, -1, -3}, {-1,-1,-1},
                {1,1,1}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }
    @Test
    public void threeRandomForces(){
        Vectors vectors = new Vectors();
        int [][]Forces = {{3,-1, 7}, {-5, 2, -4}, {2, 1, 1}};
        assertEquals("Yes", vectors.isAtEquilibrium(Forces));
    }
}