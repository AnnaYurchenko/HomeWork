package com.tel_run.collection;

import com.tel_run.Comparator.IntComparator;
import com.tel_run.Comparator.OurComparator;
import org.junit.Test;
import static org.junit.Assert.*;

public class OurArrayListTest {

    @Test
    public void testSize_empty() {
        OurArrayList list = new OurArrayList();
        assertEquals(list.size(), 0);
    }

    @Test
    public void testSize_nonEmpty() {
        int[] source = { 1, 2, 3 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        assertEquals(list.size(), source.length);
    }

    @Test
    public void testGet() {
        int[] source = { 1, 5, 4, 8 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        for (int i = 0; i < source.length; i++) {
            assertEquals(list.get(i), source[i]);
        }
    }

    @Test
    public void testSet() {
        OurArrayList list = new OurArrayList();
        list.append('x');
        list.set('y', 0);
        assertEquals(list.size(), 1);
        assertEquals(list.get(0), 'y');
    }

    @Test
    public void testRemoveById_first() {
        int[] source = { 1, 2, 5, 7 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        Object deletedNum = list.removeById(0);
        assertEquals(deletedNum, 1);
        assertEquals(list.size(), 3);
        assertEquals(list.get(0), 2);
        assertEquals(list.get(1), 5);
        assertEquals(list.get(2), 7);
    }

    @Test
    public void testRemoveById_middle() {
        int[] source = { 1, 2, 5, 7 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        Object deletedNum = list.removeById(2);
        assertEquals(deletedNum, 5);
        assertEquals(list.size(), 3);
        assertEquals(list.get(0), 1);
        assertEquals(list.get(1), 2);
        assertEquals(list.get(2), 7);
    }

    @Test
    public void testRemoveById_last() {
        int[] source = { 1, 2, 5, 7 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        Object deletedNum = list.removeById(3);
        assertEquals(deletedNum, 7);
        assertEquals(list.size(), 3);
        assertEquals(list.get(0), 1);
        assertEquals(list.get(1), 2);
        assertEquals(list.get(2), 5);
    }

    @Test
    public void testContains() {
        int[] source = { 1, 2, 5 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(5));
    }

    @Test
    public void testMax() {
        int[] source = { 1, 2, 5, 7 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        OurComparator comparator = new IntComparator();
        assertEquals(list.max(comparator),7);
    }

    @Test
    public void testMin() {
        int[] source = { 1, 2, 5, 7 };
        OurArrayList list = new OurArrayList();

        for (int num : source) {
            list.append(num);
        }

        OurComparator comparator = new IntComparator();
        assertEquals(list.min(comparator),1);
    }

}
