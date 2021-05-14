package test;

import org.junit.Test;

import static com.company.ChallengeOddPairs.solutionList;
import static com.company.ChallengeOddPairs.solutionMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChallengeOddPairsTest {

    @Test
    public void testChallengeList() {

        assertEquals(7 , solutionList(new int[]{9, 3, 9, 3, 9, 7, 9}));
        assertEquals(7 , solutionList(new int[]{7, 9, 3, 9, 3, 9, 9}));
        assertEquals(9 , solutionList(new int[]{9}));
        assertEquals(7 , solutionList(new int[]{9, 9, 7}));
        assertEquals(9 , solutionList(new int[]{9, 9, 9}));
        assertEquals(9 , solutionList(new int[]{9, 7, 9, 9, 7}));
    }

    @Test
    public void testChallengeMap() {

        assertEquals(7 , solutionMap(new int[]{9, 3, 9, 3, 9, 7, 9}));
        assertEquals(7 , solutionMap(new int[]{7, 9, 3, 9, 3, 9, 9}));
        assertEquals(9 , solutionMap(new int[]{9}));
        assertEquals(7 , solutionMap(new int[]{9, 9, 7}));
        assertEquals(9 , solutionMap(new int[]{9, 9, 9}));
        assertEquals(9 , solutionMap(new int[]{9, 7, 9, 9, 7}));
    }

//    A[0] = 9
//    A[1] = 3
//    A[2] = 9
//    A[3] = 3
//    A[4] = 9
//    A[5] = 7
//    A[6] = 9

}
