import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountConformingBitmasksTest {

    @Test
    void solution() {
        CountConformingBitmasks countConformingBitmasks=new CountConformingBitmasks();
        assertEquals(8,countConformingBitmasks.solution(1073741727,1073741631,1073741679));
    }
}