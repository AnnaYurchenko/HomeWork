package com.tel_run.collection;

import com.tel_run.Comparator.OurComparator;

public interface List {

    public abstract int size();

    public abstract void append(Object o);

    public abstract Object get(int index);

    public abstract void set(Object o, int index);

    public abstract Object removeById(int index);

    public abstract boolean remove(Object o);

    Object max(OurComparator comparator);

    Object min(OurComparator comparator);

    void sort(OurComparator comparator);

}