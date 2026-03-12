package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.RegisterRequest;
import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {
    private final StudentService studentservice;

    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @PostMapping("/request")
    public ApiResponse<StudentResponse> getResult(@RequestBody StudentRequest request) {
        StudentResponse result = studentservice.getStudentResponse(request);
        return new ApiResponse<StudentResponse>("sucess", result);

    }

    @PostMapping("/{id}/register")
    public ApiResponse<StudentResponse> assignRegister(@PathVariable Long id, 
        @RequestBody RegisterRequest registerRequest) {

        StudentResponse reponse = studentservice.assignRegistration(id, registerRequest .getRegistrationNumber());
        return new ApiResponse<StudentResponse>("success", reponse);

    }
}
