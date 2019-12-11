package com.tel_run.Comparator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntComparatorTest {

    @Test
    public void testLeftLessThanRight() {
        IntComparator comparator = new IntComparator();
        assertEquals(comparator.compare(1, 3), -1);
    }

    @Test
    public void testLeftGreaterThanRight() {
        IntComparator comparator = new IntComparator();
        assertEquals(comparator.compare(3, 1), 1);
    }

    @Test
    public void testLeftEqualToRight() {
        IntComparator comparator = new IntComparator();
        assertEquals(comparator.compare(5, 5), 0);
    }

}