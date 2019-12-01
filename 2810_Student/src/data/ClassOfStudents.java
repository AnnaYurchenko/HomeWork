package data;

import java.util.Arrays;
import java.util.Objects;
import java.util.Spliterator;

public class ClassOfStudents {

    private Student[] students;
    private int size;

    public ClassOfStudents(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public ClassOfStudents(Student[] students, int size) {
        this.students = students;
        this.size = size;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassOfStudents students1 = (ClassOfStudents) o;
        return size == students1.size &&
                Arrays.equals(students, students1.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }

    }

    public boolean addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                students[i] = students[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public int getYoungestStudentAge() {
        int min = students[0].getAge();
        for (int i = 1; i < size; i++) {
            if (min > students[i].getAge()) {
                min = students[i].getAge();
            }
        }
        return min;
    }

    public int getNumberOfStudentsByGender(Gender gender) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getGender() == gender) {
                result++;
            }
        }
        return result;
    }
}