import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {


    @Test
    void solution1() {
        FrogJump frogJump=new FrogJump();
        assertEquals(3,frogJump.solution(10,85,30));
    }

    @Test
    void solution3() {
        FrogJump frogJump=new FrogJump();
        assertEquals(34,frogJump.solution(5,105,3));
    }
}