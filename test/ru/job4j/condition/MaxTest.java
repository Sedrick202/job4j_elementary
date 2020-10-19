package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int one = Max.max(1, 2);
        assertThat(one, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int one = Max.max(3, 1);
        assertThat(one, is(3));
    }
    @Test
    public void whenMax4To4Then4() {
        int one = Max.max(4, 4);
        assertThat(one, is(4));
    }
}







