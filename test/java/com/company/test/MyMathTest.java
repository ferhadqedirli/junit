package com.company.test;

import com.company.MyMath;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void test() throws IllegalAccessException {
        int[] numbers = {1, 2, 3};
        MyMath myMath = new MyMath();
        int result = myMath.calculateSum(numbers);
        System.out.println(result);
        int expectedResult = 6;
        boolean bool = expectedResult == result;
        if (!bool) {
            throw new IllegalAccessException("Not equal");
        }
        //Absence of failure is success
        //Test condition or assert
    }
}
