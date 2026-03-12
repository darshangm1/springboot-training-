package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.entity.RegisterNumberEntity;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.RegisterNumberRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegisterNumberRepository registerNumberRepository;

    public StudentService(StudentRepository studentRepository, RegisterNumberRepository registerNumberRepository) {
        this.studentRepository = studentRepository;
        this.registerNumberRepository = registerNumberRepository;
    }

    public StudentResponse getStudentResponse(StudentRequest studentRequest) {

        StudentEntity student = new StudentEntity();
        student.setName(studentRequest.getName());

        StudentEntity entity = studentRepository.save(student);

        return new StudentResponse(entity.getName(), entity.getId(), entity.getRegistration().getRegistrationNumber());

    }

    public StudentResponse assignRegistration(long studentId, String regNumber) {

        StudentEntity student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));


        RegisterNumberEntity register = new RegisterNumberEntity();

        register.setRegistrationNumber(regNumber);
        RegisterNumberEntity savedRegister = registerNumberRepository.save(register);


        student.setRegistration(savedRegister);
        studentRepository.save(student);

        return new StudentResponse(student.getName(), student.getId(), savedRegister.getRegistrationNumber());

    }

}
