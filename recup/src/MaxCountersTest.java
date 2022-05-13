import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    @Test
    void solution() {
        MaxCounters maxCounters=new MaxCounters();
        assertEquals(Arrays.toString(new int[]{3,2,2,4,2}),Arrays.toString(maxCounters.solution(5,new int[]{3,4,4,6,1,4,4})));
    }
    @Test
    void solution1() {
        MaxCounters maxCounters=new MaxCounters();
        assertEquals(Arrays.toString(new int[]{1,2,0}),Arrays.toString(maxCounters.solution(3,new int[]{2,1,2})));
    }
    @Test
    void solution2() {
        MaxCounters maxCounters=new MaxCounters();
        assertEquals(Arrays.toString(new int[]{2,4,0}),Arrays.toString(maxCounters.solution(3,new int[]{2,1,2,2,1,2})));
    }
    @Test
    void solution3() {
        MaxCounters maxCounters=new MaxCounters();
        assertEquals(Arrays.toString(new int[]{3,3}),Arrays.toString(maxCounters.solution(2,new int[]{2,1,3,2,3,1,2})));
    }
}