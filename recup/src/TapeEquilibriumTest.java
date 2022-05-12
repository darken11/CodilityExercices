import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    @Test
    void solution() {
        TapeEquilibrium tapeEquilibrium=new TapeEquilibrium();
        assertEquals(1,tapeEquilibrium.solution(new int[]{3,1,2,4,3}));
    }
    @Test
    void solution2() {
        TapeEquilibrium tapeEquilibrium=new TapeEquilibrium();
        assertEquals(0,tapeEquilibrium.solution(new int[]{3,1,2,3,3}));
    }
    @Test
    void solution3() {
        TapeEquilibrium tapeEquilibrium=new TapeEquilibrium();
        assertEquals(1,tapeEquilibrium.solution(new int[]{3,1,2,2,3}));
    }
}