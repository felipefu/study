package test;

import com.company.Challenge;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.company.Challenge.solution;
import static org.junit.Assert.*;

public class ChallengeTest {

    @Test
    public void testChallenge() {

        assertTrue(checkArrays(new int[]{6, 3, 8, 9, 7}, solution(new int[]{3, 8, 9, 7, 6},1)));
        assertTrue(checkArrays(new int[]{9, 7, 6, 3, 8}, solution(new int[]{3, 8, 9, 7, 6},3)));
        assertTrue(checkArrays(new int[]{0 ,0, 0}, solution(new int[]{0, 0, 0},1)));
        assertTrue(checkArrays(new int[]{1, 2, 3, 4}, solution(new int[]{1, 2, 3, 4},4)));
        assertTrue(checkArrays(new int[]{2, 3, 4, 1}, solution(new int[]{1, 2, 3, 4},3)));
        assertTrue(checkArrays(new int[]{9, 7, 6, 3, 8}, solution(new int[]{3, 8, 9, 7, 6},3)));
        assertTrue(checkArrays(new int[]{1}, solution(new int[]{1},3)));
        assertTrue(checkArrays(new int[]{1}, solution(new int[]{1},3)));
        assertTrue(checkArrays(new int[]{1}, solution(new int[]{1},0)));
        assertTrue(checkArrays(new int[]{}, solution(new int[]{},3)));


    }

    private boolean checkArrays(int[] ints, int[] solution) {
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] != solution[i]){
                return false;
            }
        }
        return true;
    }
}
