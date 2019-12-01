package data;

import java.util.Objects;

public class Student {

    public String firstName;
    public String secondName;
    public Gender gender;
    public int age;

    public Student(String firstName, String secondName, Gender gender, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName) &&
                gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, gender, age);
    }

    @Override
    public String toString() {
        return "Student: " +
                "FirstName: " + firstName +
                ", SecondName: " + secondName +
                ", Gender: " + gender +
                ", Age: " + age;
    }
}

