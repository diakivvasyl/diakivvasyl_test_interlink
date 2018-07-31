package institution;

import person.Student;

import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class University {
    //name of University
    private String name;
    //average knowledge of all students
    private double averageKnow;
    //vector of all students
    private Vector<Student> students;

    public University(String name) {
        this.name = name;
        this.students=new Vector<Student>();
        this.averageKnow=0;
    }

    //sets marks to students
    public void setStudent(Student student) {
        //if student exists in University set him random mark
        if(-1!=this.students.indexOf(student))
        {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            this.students.get(this.students.indexOf(student)).Know.level=randomNum;
            this.calcAverageKnowledge();
        }
    }
    //calculate average knowledge of all students
    private void calcAverageKnowledge() {
        double tmp =0;
        for(int i=0; i<this.students.size();i++)
        {
            tmp+=this.students.get(i).getKnow().getLevel();
        }
        this.averageKnow=tmp/this.students.size();
    }
    //add student to the university
    public void addStudent(Student student) {
        //if student not exists in University add him
        if(-1==this.students.indexOf(student))
            this.students.addElement(student);
    }

    //return vector of students who are ready to go to the internship
    public Vector<Student> goToInternship(){
        Vector<Student> res = new Vector<Student>();
        for(int i=0; i<this.students.size();i++)
        {
            if(this.students.get(i).getKnow().getLevel()>this.averageKnow)
                res.add(this.students.get(i));
        }
        return res;
    }
}
