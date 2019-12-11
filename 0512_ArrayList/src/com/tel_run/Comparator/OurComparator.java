package com.tel_run.Comparator;

public interface OurComparator {
    /**
     * Compares two objects
     * @param o1 first object to compare
     * @param o2 second object to compare
     * @return -1 if first is fewer, 0 if equals, 1 if larger
     */
    int compare(Object o1, Object o2);
}


//1. Adds max, min, sort to List;
//2. They took the rule, how to compare Objects inside the List instance;
//3. Rule is instance OurComparator;
//4. For each Type of Objects need to be written own comparators.

//HW
//1. test for IntComparator
//2. write the CountryCodeComparator + tests
//3. do-write ArrayList + tests