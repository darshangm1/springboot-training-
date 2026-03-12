package com.example.demo.dto.response;

public class StudentResponse {
    private String name;
    private Long id;
    private String registrationNumber;
    
    public StudentResponse(String name, Long id, String registrationNumber) {
        this.name = name;
        this.id = id;
        this.registrationNumber = registrationNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    
    
}
