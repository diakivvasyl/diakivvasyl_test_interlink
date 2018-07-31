package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        /*university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));*/

        //create 3 students
        Student st1=new Student("Andrew Kostenko");
        Student st2=new Student("Julia Veselkina");
        Student st3=new Student("Maria Perechrest");

        //add students to university
        university.addStudent(st1);
        university.addStudent(st2);
        university.addStudent(st3);

        //university set marks to students
        university.setStudent(st1);
        university.setStudent(st2);
        university.setStudent(st3);

        Internship internship = new Internship("Interlink");
        //add students with hight knowledge to intership
        for(Student person : university.goToInternship())
            internship.setStudent(person);

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
