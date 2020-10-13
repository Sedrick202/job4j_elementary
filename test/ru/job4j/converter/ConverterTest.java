package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen1Euro() {
        int firstPoint = 140;
        int expectedOne = 1;
        int out = Converter.rubleToEuro(firstPoint);
        Assert.assertEquals(expectedOne, out);
    }

    @Test
    public void whenConvert80RblThen1Dlr() {
        int secoundPoint = 80;
        int expectedTwo = 1;
        int outTwo = Converter.rubleToDollar(secoundPoint);
        Assert.assertEquals(expectedTwo, outTwo);

    }
}