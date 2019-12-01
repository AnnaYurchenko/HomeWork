package controller;

import data.Student;
import data.Gender;
import data.ClassOfStudents;


public class StudentApp {
    public static void main(String[] args) {

        Student student1 = new Student("Anna", "Yurchenko", Gender.FEMALE, 36);
        Student student2 = new Student("Julia", "Rudova", Gender.FEMALE, 23);
        Student student3 = new Student("Alex", "Titov", Gender.MALE, 32);
        Student student4 = new Student("Oleg", "Popov", Gender.MALE, 19);
        Student student5 = new Student("Olga", "Abramova", Gender.FEMALE, 65);

        ClassOfStudents students = new ClassOfStudents(20);
        students.addStudent(student1);
        students.addStudent(student2);
        students.addStudent(student3);
        students.addStudent(student4);
        students.addStudent(student5);
        students.display();
        System.out.println("-------------------------------------");

        students.deleteStudent(student5);
        students.deleteStudent(student1);
        students.display();
        System.out.println("-------------------------------------");

        int age = students.getYoungestStudentAge();
        System.out.println("Youngest student's age is " + age);
        System.out.println("-------------------------------------");

        int numberOfMales = students.getNumberOfStudentsByGender(Gender.MALE);
        int numberOfFemales = students.getNumberOfStudentsByGender(Gender.FEMALE);
        System.out.println("Number of males is " + numberOfMales);
        System.out.println("Number of females is " + numberOfFemales);
        System.out.println("-------------------------------------");

    }
}
