package institution.interlink;

import person.Student;

import java.util.Vector;

public class Internship {
    private String name;
    private Vector<String> students;

    public Internship(String name) {
        this.name=name;
        this.students=new Vector<String>();
    }
    //add student to the internship
    public void setStudent(Student student) {
        //if student not exists in Internship add him
        if(-1==this.students.indexOf(student))
            students.addElement(student.getName());
    }
    //create string of students such as : "student name1\nStudent name2\n"
    public String getStudents() {
        String res=new String();
        for(String person : this.students)
            res=res.concat(person.concat("\n"));
        return res;
    }
}
