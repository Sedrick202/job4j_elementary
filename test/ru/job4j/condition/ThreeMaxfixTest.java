package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ThreeMaxfixTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMaxfix.max(10, 5, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void secondMax() {
        int rsl = ThreeMaxfix.max(10, 50, 1);
        assertThat(rsl, is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = ThreeMaxfix.max(1, 5, 100) ;
        assertThat(rsl, is(100));
    }

    @Test
    public void allEq() {
        int rsl = ThreeMaxfix.max(1, 1, 1);
        assertThat(rsl, is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = ThreeMaxfix.max(10, 10, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = ThreeMaxfix.max(100, 1, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = ThreeMaxfix.max(1, 100, 100);
        assertThat(rsl, is(100));
    }
}