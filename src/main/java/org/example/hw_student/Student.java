package org.example.hw_student;

public class Student implements Printable {
    private String name;
    private String id;
    private String score;


    public Student(String name, String id, String score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getScore() {
        return score;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Score: " + score);
    }
}
