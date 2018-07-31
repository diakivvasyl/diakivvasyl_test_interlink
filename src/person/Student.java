package person;

import person.consciousness.Knowledge;

public class Student {
    //name of student
    private String name;
    //knowledge of student
    private Knowledge Know;
    //construct student
    public Student(String name) {
        this.name=name;
        this.Know=new Knowledge(0);
    }

    //getters
    public String getName() {
        return name;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.Know.setLevel(knowledge.getLevel());
    }
}