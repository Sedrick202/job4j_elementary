package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest  {

    @Test
        public void whenp6tok2then2() {
            int expected = 2;
            int p = 6;
            int k = 2;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.001);
        }

    @Test
    public void whenp8tok4then0() {
        int expected = 0;
        int p = 8;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenp9tok3then3() {
        int expected = 3;
        int p = 9;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenp12tok4then4() {
        int expected = 4;
        int p = 12;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.001);
    }
}