import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solution() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(5,missingInteger.solution(new int[]{1,3,6,4,1,2}));
    }
    @Test
    void solution1() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(4,missingInteger.solution(new int[]{1,2,3}));
    }
    @Test
    void solution2() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{-1,-3}));
    }
    @Test
    void solution3() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(2,missingInteger.solution(new int[]{1}));
    }
    @Test
    void solution4() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{2}));
    }
    @Test
    void solution5() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{4,5,6,2}));
    }
    @Test
    void solution6() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{0}));
    }
    @Test
    void solution7() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{-1000000,1000000}));
    }
    @Test
    void solution8() {
        MissingInteger missingInteger=new MissingInteger();
        assertEquals(1,missingInteger.solution(new int[]{1000001,1000002}));
    }
}