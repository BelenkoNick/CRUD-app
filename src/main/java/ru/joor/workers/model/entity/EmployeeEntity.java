package ru.joor.workers.model.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

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
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", length = 36)
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
