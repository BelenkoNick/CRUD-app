package ru.joor.workers.controller.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class EmployeeDto {

    private UUID id;

    private String fullName;

    private String jobTitle;

    private Integer salary;

    private Boolean isManager;
}
