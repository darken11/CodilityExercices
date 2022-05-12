import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BinaryTest {

    @Test
    void solution() {
        Binary t=new Binary();
        assertEquals(5,t.solution(1041));

    }
    @Test
    void solution1() {
        Binary t=new Binary();
        assertEquals(2,t.solution(9));

    }
    @Test
    void solution2() {
        Binary t=new Binary();
        assertEquals(0,t.solution(32));

    }
}