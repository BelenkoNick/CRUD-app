package ru.joor.workers.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "is_manager")
    private Boolean isManager;
}
