import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctTest {

    @Test
    void solution() {
        Distinct distinct=new Distinct();
        assertEquals(3,distinct.solution(new int[]{2,1,1,2,3,1}));
    }
    @Test
    void solution1() {
        Distinct distinct=new Distinct();
        assertEquals(2,distinct.solution(new int[]{1,1,1,2,1,1}));
    }
    @Test
    void solution3() {
        Distinct distinct=new Distinct();
        assertEquals(1,distinct.solution(new int[]{1,1,1,1,1,1}));
    }
}