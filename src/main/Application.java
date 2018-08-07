package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

import java.util.Vector;

import getInterface.GetFromFile;


public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        //create 3 students
        GetFromFile get = new GetFromFile();
        Vector<Student> students = get.getStudents();

        //add students to university
        for (Student st : students)
            university.addStudent(st);

        //university set marks to students
        for (Student st : students)
            university.setStudent(st);

        Internship internship = new Internship("Interlink");

        //add students with hight knowledge to intership
        for (Student person : university.goToInternship())
            internship.setStudent(person);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
