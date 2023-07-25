package com.jog.leetcode.free;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void twoSum() {
        Problem1 problem1 = new Problem1();
        int [] nums = {1,2,3};
        int target = 5;
        //Arrays.stream(problem1.twoSum(nums, target)).asDoubleStream().forEach(System.out::println);
        assertTrue(problem1.twoSum(nums, target)[0] == 1);
    }
}