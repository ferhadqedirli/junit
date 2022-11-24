package com.company.test;

import com.company.MyMath;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    private final MyMath myMath = new MyMath();

    @Test
    public void calculateSum_ThreeMemberArray() throws IllegalAccessException {
        if (!(6 == myMath.calculateSum(new int[]{1, 2, 3}))) {
            throw new IllegalAccessException("Not equal");
        }
    }

    @Test
    public void calculateSum_ThreeLengthArray() throws IllegalAccessException {
        if (!(0 == myMath.calculateSum(new int[]{}))) {
            throw new IllegalAccessException("Not equal");
        }
    }
}
