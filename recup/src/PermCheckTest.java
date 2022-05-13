import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    @Test
    void solution() {
        PermCheck permCheck=new PermCheck();
        assertEquals(1,permCheck.solution(new int[]{4,1,3,2}));
    }
    @Test
    void solution2() {
        PermCheck permCheck=new PermCheck();
        assertEquals(0,permCheck.solution(new int[]{4,1,3}));
    }
    @Test
    void solution3() {
        PermCheck permCheck=new PermCheck();
        assertEquals(1,permCheck.solution(new int[]{1}));
    }

}