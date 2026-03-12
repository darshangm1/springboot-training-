package com.example.demo.dto.request;

import java.util.List;  

public class StudentRequest {
    
    private String name;
    private int rollnumber;
    private List<Integer> marks;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollnumber;
    }
    public void setRollNumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public List<Integer> getMarks() {
        return marks;
    }
    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
    


}
