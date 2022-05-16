import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void solution() {
        Triangle triangle=new Triangle();
        assertEquals(1,triangle.solution(new int[]{10,2,5,1,8,20}));
    }
    @Test
    void solution1() {
        Triangle triangle=new Triangle();
        assertEquals(0,triangle.solution(new int[]{}));
    }
    @Test
    void solution2() {
        Triangle triangle=new Triangle();
        assertEquals(0,triangle.solution(new int[]{10,50,5,1}));
    }
}