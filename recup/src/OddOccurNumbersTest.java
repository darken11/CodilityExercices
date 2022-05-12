import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurNumbersTest {

    @Test
    void solution() {
        OddOccurNumbers oddOccurNumbers=new OddOccurNumbers();
        assertEquals(7,oddOccurNumbers.solution(new int[]{9,3,9,3,9,7,9}));

    }
}