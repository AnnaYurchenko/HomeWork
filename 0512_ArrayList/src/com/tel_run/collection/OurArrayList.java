package com.tel_run.collection;

import com.tel_run.Comparator.OurComparator;

import java.util.Arrays;
import java.util.Objects;

public class OurArrayList implements List {
    private Object[] source;
    private int sourceSize; //need to define size, in other way -  default size will be returned
    private static final int DEFAULT_CAPACITY = 16;

    OurArrayList() {
        source = new Object[DEFAULT_CAPACITY];
        sourceSize = 0;
    }

    public int size() {
        return sourceSize;
    }

    public void append(Object o) {
        if (sourceSize == source.length) {
            Object[] newSource = new Object[sourceSize * 2];
            System.arraycopy(source, 0, newSource, 0, source.length);
            source = newSource;
        }
        source[sourceSize] = o;
        sourceSize++;
    }

    public Object get(int index) {
        if (index >= sourceSize || index < 0)
            throw new IndexOutOfBoundsException();
        return source[index];
    }

    public void set(Object o, int index) {
        if (index >= sourceSize || index < 0)
            throw new IndexOutOfBoundsException();
        source[index] = o;
    }

    public Object removeById(int index) {
        Object o = source[index];

        /*
        [0, 1, 2, 3, 4]
        sourceSize = 5
        index = 2
        remove(2);
        copy from 2 + 1 = 3
        copy to 2
        number of objects 5 - (2 + 1) = 2
        [0, 1, 3, 4]
         */
        // Copy all objects from index + 1 to index.
        System.arraycopy(source, index + 1, source, index, sourceSize - (index + 1));
        sourceSize--;

        return o;
    }

    public boolean remove(Object o) {
        for (int i = 0; i < sourceSize; i++) {
            if (source[i] == o) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object max(OurComparator comparator) {
        Object max = source[0];

        for (int i = 0; i < sourceSize; i++) {
            if (comparator.compare(source[i], max) > 0)
                max = source[i];
        }

        return max;
    }

    @Override
    public Object min(OurComparator comparator) {
        Object min = source[0];

        for (int i = 0; i < sourceSize ; i++) {
            if (comparator.compare(source[i], min) < 0)
                min = source[i];
        }

        return min;
    }

    @Override
    public void sort(OurComparator comparator) {

    }

    public boolean contains(Object o) {
        for (int i = 0; i < sourceSize ; i++) {
            if (source[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OurArrayList that = (OurArrayList) o;
        return sourceSize == that.sourceSize &&
                Arrays.equals(source, that.source);
    }

    public int hashCode() {
        int result = Objects.hash(sourceSize);
        result = 31 * result + Arrays.hashCode(source);
        return result;
    }
}
