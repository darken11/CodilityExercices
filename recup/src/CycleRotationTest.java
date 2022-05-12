import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CycleRotationTest {
   @Test
   void solution(){
       CycleRotation cycleRotation=new CycleRotation();
       assertEquals(Arrays.toString(new int[]{9,7,6,3,8}), Arrays.toString((cycleRotation.solution(new int[]{3,8,9,7,6}, 3))));
   }
    @Test
    void solution1(){
        CycleRotation cycleRotation=new CycleRotation();
        assertEquals(Arrays.toString(new int[]{0,0,0}), Arrays.toString((cycleRotation.solution(new int[]{0,0,0}, 1))));
    }
    @Test
    void solution2(){
        CycleRotation cycleRotation=new CycleRotation();
        assertEquals(Arrays.toString(new int[]{1,2,3,4}), Arrays.toString((cycleRotation.solution(new int[]{1, 2, 3, 4}, 4))));
    }
    @Test
    void solution3(){
        CycleRotation cycleRotation=new CycleRotation();
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString((cycleRotation.solution(new int[]{1}, 1))));
    }

}