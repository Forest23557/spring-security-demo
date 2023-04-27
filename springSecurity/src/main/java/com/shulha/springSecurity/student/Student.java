package com.shulha.springSecurity.student;

import lombok.Data;

@Data
public class Student {

    private final Integer studentId;

    private final String studentName;

    public Student(final Integer studentId, final String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
