import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    void solution() {
        PermMissingElem permMissingElem=new PermMissingElem();
        assertEquals(4,permMissingElem.solution(new int[]{2,3,1,5}));
    }
    @Test
    void solution1() {
        PermMissingElem permMissingElem=new PermMissingElem();
        assertEquals(3,permMissingElem.solution(new int[]{2,4,1}));
    }
    @Test
    void solution2() {
        PermMissingElem permMissingElem=new PermMissingElem();
        assertEquals(5,permMissingElem.solution(new int[]{2,3,1,4,6}));
    }

    @Test
    void solution3() {
        PermMissingElem permMissingElem=new PermMissingElem();
        assertEquals(1,permMissingElem.solution(new int[]{}));
    }
    @Test
    void solution4() {
        PermMissingElem permMissingElem=new PermMissingElem();
        assertEquals(2,permMissingElem.solution(new int[]{1}));
    }
}