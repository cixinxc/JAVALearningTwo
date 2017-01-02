package com.cixin.LeetCode.TwoSum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
/**
 * Created by cixinxc on 2017/1/1.
 */
public class TwoSumSolutionTest {
    private TwoSumSolution tss;
    @Before
    public void setUp() throws Exception {
        tss = new TwoSumSolution();
    }

    @Test
    public void Test() throws Exception {
        int[] numbers = {1, 2, 3, 4};
        int[] result = {0,1};
    //    assertEquals( result, tss.twoSum(numbers, 3));
        assertArrayEquals( result, tss.twoSum(numbers, 3));
    //    assertEquals(3, tss.add(1, 2));
    }

}