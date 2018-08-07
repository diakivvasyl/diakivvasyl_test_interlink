/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getInterface;

import java.util.Vector;

import person.Student;


public class GetFromFile {
    private Vector<Student> data;

    public Vector<Student> getStudents() {
        data = new Vector<Student>();
        Student st1 = new Student("Andrew Kostenko");
        Student st2 = new Student("Julia Veselkina");
        Student st3 = new Student("Maria Perechrest");
        data.addElement(st1);
        data.addElement(st2);
        data.addElement(st3);
        return data;
    }
}
