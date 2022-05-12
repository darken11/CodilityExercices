import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    void solution() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(6,frogRiverOne.solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }
    @Test
    void solution1() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(0,frogRiverOne.solution(1,new int[]{1}));
    }
    @Test
    void solution2() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(-1,frogRiverOne.solution(2,new int[]{2,2,2,2,2}));
    }
    @Test
    void solution3() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(-1,frogRiverOne.solution(5,new int[]{1,2,3,5,3,1}));
    }
    @Test
    void solution4() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(4,frogRiverOne.solution(3,new int[]{1,3,1,3,2,1,3}));
    }
    @Test
    void solution5() {
        FrogRiverOne frogRiverOne=new FrogRiverOne();
        assertEquals(-1,frogRiverOne.solution(0,new int[]{}));
    }
}