package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import math.MyMath;

public class MyMathTest {
    @Test
    public void testMulti() {
        MyMath math = new MyMath();
        assertEquals(50, math.multi(5, 10));
    }
}