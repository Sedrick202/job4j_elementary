package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest  {
    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.5;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.001);

    }
}