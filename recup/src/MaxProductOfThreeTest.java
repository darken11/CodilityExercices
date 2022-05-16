import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    @Test
    void solution() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(60,maxProductOfThree.solution(new int[]{-3,1,2,-2,5,6}));
    }

    @Test
    void solution2() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(-6,maxProductOfThree.solution(new int[]{-3,1,2}));
    }
    @Test
    void solution3() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(0,maxProductOfThree.solution(new int[]{-3,1}));
    }
    @Test
    void solution4() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(0,maxProductOfThree.solution(new int[]{-3,1,0}));
    }
    @Test
    void solution5() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(125,maxProductOfThree.solution(new int[]{-5,5,-5,4}));
    }
    @Test
    void solution6() {
        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
        assertEquals(120,maxProductOfThree.solution(new int[]{-4,-6,3,4,5}));
    }
//    @Test
//    void solution7() {
//        MaxProductOfThree maxProductOfThree=new MaxProductOfThree();
//        assertEquals(105,maxProductOfThree.solution(new int[]{4,7,3,2,1,-3,-5}));
//    }
}