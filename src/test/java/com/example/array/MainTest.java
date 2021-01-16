package com.example.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void basicTests() {

        Main m = new Main();

        int[] numsOne = {1,1,2};
        assertEquals(2, m.removeDuplicate(numsOne));

        int[] numsTwo = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, m.removeDuplicate(numsTwo));

        int[] numsThree = {};
        assertEquals(0, m.removeDuplicate(numsThree));

        int[] numsFour = {1};
        assertEquals(1, m.removeDuplicate(numsFour));

        int[] numsFive = {2, 2, 2};
        assertEquals(1, m.removeDuplicate(numsFour));

    }
}
